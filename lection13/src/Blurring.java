import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class Blurring {
    public static void main(String[] args) throws IOException {
        BufferedImage originalImage = ImageIO.read(new File("image.jpg"));
        WritableRaster originalImageRaster = originalImage.getRaster();

        int width = originalImageRaster.getWidth();
        int height = originalImageRaster.getHeight();

        BufferedImage resultImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        WritableRaster resultantImageRaster = resultImage.getRaster();

        final int colorsCountInRgb = 3;

        int[] originalImagePixel = new int[colorsCountInRgb];
        double[] resultImagePixel = new double[colorsCountInRgb];

        int matrixSize = 17;
        int matrixElementsCount = matrixSize * matrixSize;
        double matrixRatio = 1.0 / matrixElementsCount;

        double[][] matrix = new double[matrixSize][matrixSize];

        int indent = matrixSize / 2;

        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix.length; ++j) {
                matrix[i][j] = matrixRatio;
            }
        }

        int xUpperLimit = originalImageRaster.getWidth() - indent;
        int yUpperLimit = originalImageRaster.getHeight() - indent;

        for (int y = indent; y < yUpperLimit; ++y) {
            for (int x = indent; x < xUpperLimit; ++x) {
                double redComponentsSum = 0;
                double greenComponentsSum = 0;
                double blueComponentsSum = 0;

                for (int matrixElementY = 0, neighboringPixelY = y - indent; matrixElementY < matrixSize; ++matrixElementY, ++neighboringPixelY) {
                    for (int matrixElementX = 0, neighboringPixelX = x - indent; matrixElementX < matrixSize; ++matrixElementX, ++neighboringPixelX) {
                        originalImageRaster.getPixel(neighboringPixelX, neighboringPixelY, originalImagePixel);

                        double ratio = matrix[matrixElementY][matrixElementX];

                        redComponentsSum += originalImagePixel[0] * ratio;
                        greenComponentsSum += originalImagePixel[1] * ratio;
                        blueComponentsSum += originalImagePixel[2] * ratio;
                    }
                }

                resultImagePixel[0] = redComponentsSum;
                resultImagePixel[1] = greenComponentsSum;
                resultImagePixel[2] = blueComponentsSum;

                for (int i = 0; i < colorsCountInRgb; ++i) {
                    if (resultImagePixel[i] <= 0) {
                        resultImagePixel[i] = 0;
                    } else if (resultImagePixel[i] >= 255) {
                        resultImagePixel[i] = 255;
                    } else {
                        resultImagePixel[i] = Math.round(resultImagePixel[i]);
                    }
                }

                resultantImageRaster.setPixel(x, y, resultImagePixel);
            }
        }

        ImageIO.write(resultImage, "png", new File("blurringImage.jpg"));
    }
}