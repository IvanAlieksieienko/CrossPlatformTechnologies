/**
 * @author Alieksieienko Ivan i.alieksieienko@student.csn.khai.edu
 * @version 1.0
 */

public class Initials {
    
    private static String _group = "545B";
    private static String _fullName = "Alieksieienko Ivan Andriyovich";
    private static int _variant = 1;
    private static String _initials =   "    **        **       **\n" +
                                        "   ** **      **      ** **\n" +
                                        "  *******     **     *******\n" +
                                        " **     **    **    **     **\n" +
                                        "**       **   **   **       **\n";

    public static void main(String[] args) {
        System.out.println("Group: " + _group);
        System.out.println("Student: " + _fullName);
        System.out.println("Variant: " + _variant);
        System.out.println(_initials);
    }
}