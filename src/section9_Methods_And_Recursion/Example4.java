package section9_Methods_And_Recursion;
// Demonstration of Method to Retrieve Website Name from URL
public class Example4 {
    static String getWebsiteName(String websiteUrl)
    {
        // Starting point + 1 to get index of first word of a website
        int startPoint = websiteUrl.indexOf('.') + 1;

        // Ending point to get last index of '.' keyword, to get the last character of website name
        int endPoint   = websiteUrl.lastIndexOf('.');

        String websiteName = websiteUrl.substring(startPoint, endPoint);

        return  websiteName;
    }

    public static void main(String[] args)
    {
        String ans = getWebsiteName("www.netflix.com");
        System.out.println(ans);

        ans = getWebsiteName("www.youtube.com");
        System.out.println(ans);

        String website1 = "www.github.com";
        ans = getWebsiteName(website1);
        System.out.println(ans);
    }
}
