public class Url {
    public static void main(String[] args) {
        String url = "https://SomeServerName/khl";

        System.out.print(getServerName(url));
    }

    public static String getServerName(String url) {
        int serverNameStartIndex = url.indexOf("://") + 3;
        int slashIndex = url.indexOf("/", serverNameStartIndex);

        if (slashIndex == -1) {
            return url.substring(serverNameStartIndex);
        }

        return url.substring(serverNameStartIndex, slashIndex);
    }
}