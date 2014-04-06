package org.ninit.training.dynamic.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.ninit.training.search.LongestCommonSubstring;

public class LongestCommonSubstringTest {
    private String longString =
            "Lorem ipsum dolor sit amet, consectetuer "
                    + "adipiscing elit, sed diam nonummy nibh euismod "
                    + "tincidunt ut laoreet dolore magna aliquam erat "
                    + "volutpat. Ut wisi enim ad minim veniam, quis "
                    + "nostrud exerci tation ullamcorper suscipit lobortis "
                    + "nisl ut aliquip ex ea commodo consequat. Duis autem vel "
                    + "eum iriure dolor in hendrerit in vulputate velit esse "
                    + "molestie consequat, vel illum dolore eu feugiat nulla "
                    + "facilisis at vero eros et accumsan et iusto odio dignissim "
                    + "qui blandit praesent luptatum zzril delenit augue duis dolore "
                    + "te feugait nulla facilisi. Nam liber tempor cum soluta nobis "
                    + "eleifend option congue nihil imperdiet doming id quod mazim "
                    + "placerat facer possim assum. Typi non habent claritatem "
                    + "insitam; est usus legentis in iis qui facit eorum claritatem. "
                    + "Investigationes demonstraverunt lectores legere me lius quod ii "
                    + "legunt saepius. Claritas est etiam processus dynamicus, qui sequitur "
                    + "mutationem consuetudium lectorum. Mirum est notare quam littera gothica, "
                    + "quam nunc putamus parum claram, anteposuerit litterarum formas humanitatis"
                    + " per seacula quarta decima et quinta decima. Eodem modo typi, qui nunc "
                    + "nobis videntur parum clari, fiant sollemnes in futurum.";

    private String test1 = "";
    private String test2 = null;
    private String test3 = "elit, sed diam nonummy n";
    private String test4 = ",";
    private String test5 = "Lorem ipsum dolor sit ametest notare quam "
            + "littera gothica, quam nunc putamus paru ";
    private String test6 =
            "Lorem ipsum dolor sit amet, consectetuer "
                    + "adipiscing elit, sed diam nonummy nibh euismod "
                    + "tincidunt ut laoreet dolore magna aliquam erat "
                    + "volutpat. Ut wisi enim ad minim veniam, quis "
                    + "nostrud exerci tation ullamcorper suscipit lobortis "
                    + "nisl ut aliquip ex ea commodo consequat. Duis autem vel "
                    + "eum iriure dolor in hendrerit in vulputate velit esse "
                    + "molestie consequat, vel illum dolore eu feugiat nulla "
                    + "facilisis at vero eros et accumsan et iusto odio dignissim "
                    + "qui blandit praesent luptatum zzril delenit augue duis dolore "
                    + "te feugait nulla facilisi. Nam liber tempor cum soluta nobis "
                    + "eleifend option congue nihil imperdiet doming id quod mazim "
                    + "placerat facer possim assum. Typi non habent claritatem "
                    + "insitam; est usus legentis in iis qui facit eorum claritatem. "
                    + "Investigationes demonstraverunt lectores legere me lius quod ii "
                    + "legunt saepius. Claritas est etiam processus dynamicus, qui sequitur "
                    + "mutationem consuetudium lectorum. Mirum est notare quam littera gothica, "
                    + "quam nunc putamus parum claram, anteposuerit litterarum formas humanitatis"
                    + " per seacula quarta decima et quinta decima. Eodem modo typi, qui nunc "
                    + "nobis videntur parum clari, fiant sollemnes in futurum.";

    @Test
    public void test() {
        assertEquals(test1, LongestCommonSubstring.findLongestCommonSubstring(
                test1, longString));
        assertEquals("", LongestCommonSubstring.findLongestCommonSubstring(
                test2, longString));
        assertEquals(test3, LongestCommonSubstring.findLongestCommonSubstring(
                test3, longString));
        assertEquals(test4, LongestCommonSubstring.findLongestCommonSubstring(
                test4, longString));
        assertEquals("est notare quam littera gothica, quam nunc putamus paru",
                LongestCommonSubstring.findLongestCommonSubstring(test5,
                        longString));
        assertEquals(test6, LongestCommonSubstring.findLongestCommonSubstring(
                test6, longString));
    }

}
