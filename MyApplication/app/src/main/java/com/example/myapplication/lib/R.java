package com.example.myapplication.lib;

public final class R {
    public static final class attr {
        /**  Whether or not the indicators should be centered.
         <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         */
        public static int centered=0x7f010004;
        /**  Screen edge padding.
         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
         Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
         in (inches), mm (millimeters).
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         */
        public static int clipPadding=0x7f01000b;
        /**  Color of the filled circle that represents the current page.
         <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
         "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         */
        public static int fillColor=0x7f010005;
        /**  Color of the footer line and indicator.
         <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
         "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         */
        public static int footerColor=0x7f01000c;
        /**  Height of the indicator above the footer line.
         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
         Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
         in (inches), mm (millimeters).
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         */
        public static int footerIndicatorHeight=0x7f01000f;
        /**  Style of the indicator. Default is triangle.
         <p>Must be one of the following constant values.</p>
         <table>
         <colgroup align="left" />
         <colgroup align="left" />
         <colgroup align="left" />
         <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         <tr><td><code>none</code></td><td>0</td><td></td></tr>
         <tr><td><code>triangle</code></td><td>1</td><td></td></tr>
         <tr><td><code>underline</code></td><td>2</td><td></td></tr>
         </table>
         */
        public static int footerIndicatorStyle=0x7f01000e;
        /**  Left and right padding of the underline indicator.
         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
         Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
         in (inches), mm (millimeters).
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         */
        public static int footerIndicatorUnderlinePadding=0x7f010010;
        /**  Height of the footer line.
         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
         Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
         in (inches), mm (millimeters).
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         */
        public static int footerLineHeight=0x7f01000d;
        /**  Padding between the bottom of the title and the footer.
         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
         Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
         in (inches), mm (millimeters).
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         */
        public static int footerPadding=0x7f010011;
        /**  Orientation of the indicator.
         <p>Must be one of the following constant values.</p>
         <table>
         <colgroup align="left" />
         <colgroup align="left" />
         <colgroup align="left" />
         <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         <tr><td><code>horizontal</code></td><td>0</td><td></td></tr>
         <tr><td><code>vertical</code></td><td>1</td><td></td></tr>
         </table>
         */
        public static int orientation=0x7f010006;
        /**  Radius of the circles. This is also the spacing between circles.
         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
         Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
         in (inches), mm (millimeters).
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         */
        public static int radius=0x7f010007;
        /**  Whether or not the selected item is displayed as bold.
         <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         */
        public static int selectedBold=0x7f010013;
        /**  Color of the selected title.
         <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
         "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         */
        public static int selectedColor=0x7f010012;
        /**  Whether or not the selected indicator snaps to the circles.
         <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         */
        public static int snap=0x7f010008;
        /**  Color of the open circles.
         <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
         "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         */
        public static int strokeColor=0x7f010009;
        /**  Width of the stroke used to draw the circles.
         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
         Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
         in (inches), mm (millimeters).
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         */
        public static int strokeWidth=0x7f01000a;
        /**  Color of regular titles.
         <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
         "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         */
        public static int textColor=0x7f010014;
        /**  Size of title text.
         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
         Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
         in (inches), mm (millimeters).
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         */
        public static int textSize=0x7f010015;
        /**  Padding between titles when bumping into each other.
         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
         Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
         in (inches), mm (millimeters).
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         */
        public static int titlePadding=0x7f010016;
        /**  Padding between titles and the top of the View.
         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
         Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
         in (inches), mm (millimeters).
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         */
        public static int topPadding=0x7f010017;
        /**  Style of the circle indicator.
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
         or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static int vpiCirclePageIndicatorStyle=0x7f010000;
        /**  Style of the tab indicator.
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
         or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static int vpiTabPageIndicatorStyle=0x7f010002;
        /**  Style of the text in a tab.
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
         or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static int vpiTabTextStyle=0x7f010003;
        /**  Style of the title indicator.
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
         or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static int vpiTitlePageIndicatorStyle=0x7f010001;
    }
    public static final class bool {
        public static int default_circle_indicator_centered=0x7f070000;
        public static int default_circle_indicator_snap=0x7f070001;
        public static int default_title_indicator_selected_bold=0x7f070002;
    }
    public static final class color {
        public static int default_circle_indicator_fill_color=0x7f060008;
        public static int default_circle_indicator_stroke_color=0x7f060009;
        public static int default_title_indicator_footer_color=0x7f06000a;
        public static int default_title_indicator_selected_color=0x7f06000b;
        public static int default_title_indicator_text_color=0x7f06000c;
        public static int vpi__background_holo_dark=0x7f060000;
        public static int vpi__background_holo_light=0x7f060001;
        public static int vpi__bright_foreground_disabled_holo_dark=0x7f060004;
        public static int vpi__bright_foreground_disabled_holo_light=0x7f060005;
        public static int vpi__bright_foreground_holo_dark=0x7f060002;
        public static int vpi__bright_foreground_holo_light=0x7f060003;
        public static int vpi__bright_foreground_inverse_holo_dark=0x7f060006;
        public static int vpi__bright_foreground_inverse_holo_light=0x7f060007;
        public static int vpi__dark_theme=0x7f06000d;
        public static int vpi__light_theme=0x7f06000e;
    }
    public static final class dimen {
        public static int default_circle_indicator_radius=0x7f090000;
        public static int default_circle_indicator_stroke_width=0x7f090001;
        public static int default_title_indicator_clip_padding=0x7f090002;
        public static int default_title_indicator_footer_indicator_height=0x7f090004;
        public static int default_title_indicator_footer_indicator_underline_padding=0x7f090005;
        public static int default_title_indicator_footer_line_height=0x7f090003;
        public static int default_title_indicator_footer_padding=0x7f090006;
        public static int default_title_indicator_text_size=0x7f090007;
        public static int default_title_indicator_title_padding=0x7f090008;
        public static int default_title_indicator_top_padding=0x7f090009;
    }
    public static final class drawable {
        public static int ic_launcher=0x7f020000;
        public static int vpi__tab_indicator=0x7f020001;
        public static int vpi__tab_selected_focused_holo=0x7f020002;
        public static int vpi__tab_selected_holo=0x7f020003;
        public static int vpi__tab_selected_pressed_holo=0x7f020004;
        public static int vpi__tab_unselected_focused_holo=0x7f020005;
        public static int vpi__tab_unselected_holo=0x7f020006;
        public static int vpi__tab_unselected_pressed_holo=0x7f020007;
    }
    public static final class id {
        public static int horizontal=0x7f050000;
        public static int none=0x7f050002;
        public static int triangle=0x7f050003;
        public static int underline=0x7f050004;
        public static int vertical=0x7f050001;
    }
    public static final class integer {
        public static int default_circle_indicator_orientation=0x7f080000;
        public static int default_title_indicator_footer_indicator_style=0x7f080001;
    }
    public static final class layout {
        public static int main=0x7f030000;
        public static int vpi__tab=0x7f030001;
    }
    public static final class string {
        public static int app_name=0x7f040001;
        public static int hello=0x7f040000;
    }
    public static final class style {
        public static int TextAppearance_TabPageIndicator=0x7f0a0006;
        public static int Theme_PageIndicatorDefaults=0x7f0a0000;
        public static int Widget=0x7f0a0001;
        public static int Widget_CirclePageIndicator=0x7f0a0002;
        public static int Widget_TabPageIndicator=0x7f0a0004;
        public static int Widget_TabPageIndicator_Text=0x7f0a0005;
        public static int Widget_TitlePageIndicator=0x7f0a0003;
    }
    public static final class styleable {
        /** Attributes that can be used with a CirclePageIndicator.
         <p>Includes the following attributes:</p>
         <table>
         <colgroup align="left" />
         <colgroup align="left" />
         <tr><th>Attribute</th><th>Description</th></tr>
         <tr><td><code>{@link #CirclePageIndicator_centered com.viewpagerindicator:centered}</code></td><td> Whether or not the indicators should be centered.</td></tr>
         <tr><td><code>{@link #CirclePageIndicator_fillColor com.viewpagerindicator:fillColor}</code></td><td> Color of the filled circle that represents the current page.</td></tr>
         <tr><td><code>{@link #CirclePageIndicator_orientation com.viewpagerindicator:orientation}</code></td><td> Orientation of the indicator.</td></tr>
         <tr><td><code>{@link #CirclePageIndicator_radius com.viewpagerindicator:radius}</code></td><td> Radius of the circles.</td></tr>
         <tr><td><code>{@link #CirclePageIndicator_snap com.viewpagerindicator:snap}</code></td><td> Whether or not the selected indicator snaps to the circles.</td></tr>
         <tr><td><code>{@link #CirclePageIndicator_strokeColor com.viewpagerindicator:strokeColor}</code></td><td> Color of the open circles.</td></tr>
         <tr><td><code>{@link #CirclePageIndicator_strokeWidth com.viewpagerindicator:strokeWidth}</code></td><td> Width of the stroke used to draw the circles.</td></tr>
         </table>
         @see #CirclePageIndicator_centered
         @see #CirclePageIndicator_fillColor
         @see #CirclePageIndicator_orientation
         @see #CirclePageIndicator_radius
         @see #CirclePageIndicator_snap
         @see #CirclePageIndicator_strokeColor
         @see #CirclePageIndicator_strokeWidth
         */
        public static final int[] CirclePageIndicator = {
                0x7f010004, 0x7f010005, 0x7f010006, 0x7f010007,
                0x7f010008, 0x7f010009, 0x7f01000a
        };
        /**
         <p>
         @attr description
         Whether or not the indicators should be centered.


         <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         <p>This is a private symbol.
         @attr name android:centered
         */
        public static final int CirclePageIndicator_centered = 0;
        /**
         <p>
         @attr description
         Color of the filled circle that represents the current page.


         <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
         "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         <p>This is a private symbol.
         @attr name android:fillColor
         */
        public static final int CirclePageIndicator_fillColor = 1;
        /**
         <p>
         @attr description
         Orientation of the indicator.


         <p>Must be one of the following constant values.</p>
         <table>
         <colgroup align="left" />
         <colgroup align="left" />
         <colgroup align="left" />
         <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         <tr><td><code>horizontal</code></td><td>0</td><td></td></tr>
         <tr><td><code>vertical</code></td><td>1</td><td></td></tr>
         </table>
         <p>This is a private symbol.
         @attr name android:orientation
         */
        public static final int CirclePageIndicator_orientation = 2;
        /**
         <p>
         @attr description
         Radius of the circles. This is also the spacing between circles.


         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
         Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
         in (inches), mm (millimeters).
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         <p>This is a private symbol.
         @attr name android:radius
         */
        public static final int CirclePageIndicator_radius = 3;
        /**
         <p>
         @attr description
         Whether or not the selected indicator snaps to the circles.


         <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         <p>This is a private symbol.
         @attr name android:snap
         */
        public static final int CirclePageIndicator_snap = 4;
        /**
         <p>
         @attr description
         Color of the open circles.


         <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
         "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         <p>This is a private symbol.
         @attr name android:strokeColor
         */
        public static final int CirclePageIndicator_strokeColor = 5;
        /**
         <p>
         @attr description
         Width of the stroke used to draw the circles.


         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
         Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
         in (inches), mm (millimeters).
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         <p>This is a private symbol.
         @attr name android:strokeWidth
         */
        public static final int CirclePageIndicator_strokeWidth = 6;
        /** Attributes that can be used with a TitlePageIndicator.
         <p>Includes the following attributes:</p>
         <table>
         <colgroup align="left" />
         <colgroup align="left" />
         <tr><th>Attribute</th><th>Description</th></tr>
         <tr><td><code>{@link #TitlePageIndicator_clipPadding com.viewpagerindicator:clipPadding}</code></td><td> Screen edge padding.</td></tr>
         <tr><td><code>{@link #TitlePageIndicator_footerColor com.viewpagerindicator:footerColor}</code></td><td> Color of the footer line and indicator.</td></tr>
         <tr><td><code>{@link #TitlePageIndicator_footerIndicatorHeight com.viewpagerindicator:footerIndicatorHeight}</code></td><td> Height of the indicator above the footer line.</td></tr>
         <tr><td><code>{@link #TitlePageIndicator_footerIndicatorStyle com.viewpagerindicator:footerIndicatorStyle}</code></td><td> Style of the indicator.</td></tr>
         <tr><td><code>{@link #TitlePageIndicator_footerIndicatorUnderlinePadding com.viewpagerindicator:footerIndicatorUnderlinePadding}</code></td><td> Left and right padding of the underline indicator.</td></tr>
         <tr><td><code>{@link #TitlePageIndicator_footerLineHeight com.viewpagerindicator:footerLineHeight}</code></td><td> Height of the footer line.</td></tr>
         <tr><td><code>{@link #TitlePageIndicator_footerPadding com.viewpagerindicator:footerPadding}</code></td><td> Padding between the bottom of the title and the footer.</td></tr>
         <tr><td><code>{@link #TitlePageIndicator_selectedBold com.viewpagerindicator:selectedBold}</code></td><td> Whether or not the selected item is displayed as bold.</td></tr>
         <tr><td><code>{@link #TitlePageIndicator_selectedColor com.viewpagerindicator:selectedColor}</code></td><td> Color of the selected title.</td></tr>
         <tr><td><code>{@link #TitlePageIndicator_textColor com.viewpagerindicator:textColor}</code></td><td> Color of regular titles.</td></tr>
         <tr><td><code>{@link #TitlePageIndicator_textSize com.viewpagerindicator:textSize}</code></td><td> Size of title text.</td></tr>
         <tr><td><code>{@link #TitlePageIndicator_titlePadding com.viewpagerindicator:titlePadding}</code></td><td> Padding between titles when bumping into each other.</td></tr>
         <tr><td><code>{@link #TitlePageIndicator_topPadding com.viewpagerindicator:topPadding}</code></td><td> Padding between titles and the top of the View.</td></tr>
         </table>
         @see #TitlePageIndicator_clipPadding
         @see #TitlePageIndicator_footerColor
         @see #TitlePageIndicator_footerIndicatorHeight
         @see #TitlePageIndicator_footerIndicatorStyle
         @see #TitlePageIndicator_footerIndicatorUnderlinePadding
         @see #TitlePageIndicator_footerLineHeight
         @see #TitlePageIndicator_footerPadding
         @see #TitlePageIndicator_selectedBold
         @see #TitlePageIndicator_selectedColor
         @see #TitlePageIndicator_textColor
         @see #TitlePageIndicator_textSize
         @see #TitlePageIndicator_titlePadding
         @see #TitlePageIndicator_topPadding
         */
        public static final int[] TitlePageIndicator = {
                0x7f01000b, 0x7f01000c, 0x7f01000d, 0x7f01000e,
                0x7f01000f, 0x7f010010, 0x7f010011, 0x7f010012,
                0x7f010013, 0x7f010014, 0x7f010015, 0x7f010016,
                0x7f010017
        };
        /**
         <p>
         @attr description
         Screen edge padding.


         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
         Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
         in (inches), mm (millimeters).
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         <p>This is a private symbol.
         @attr name android:clipPadding
         */
        public static final int TitlePageIndicator_clipPadding = 0;
        /**
         <p>
         @attr description
         Color of the footer line and indicator.


         <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
         "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         <p>This is a private symbol.
         @attr name android:footerColor
         */
        public static final int TitlePageIndicator_footerColor = 1;
        /**
         <p>
         @attr description
         Height of the indicator above the footer line.


         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
         Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
         in (inches), mm (millimeters).
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         <p>This is a private symbol.
         @attr name android:footerIndicatorHeight
         */
        public static final int TitlePageIndicator_footerIndicatorHeight = 4;
        /**
         <p>
         @attr description
         Style of the indicator. Default is triangle.


         <p>Must be one of the following constant values.</p>
         <table>
         <colgroup align="left" />
         <colgroup align="left" />
         <colgroup align="left" />
         <tr><th>Constant</th><th>Value</th><th>Description</th></tr>
         <tr><td><code>none</code></td><td>0</td><td></td></tr>
         <tr><td><code>triangle</code></td><td>1</td><td></td></tr>
         <tr><td><code>underline</code></td><td>2</td><td></td></tr>
         </table>
         <p>This is a private symbol.
         @attr name android:footerIndicatorStyle
         */
        public static final int TitlePageIndicator_footerIndicatorStyle = 3;
        /**
         <p>
         @attr description
         Left and right padding of the underline indicator.


         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
         Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
         in (inches), mm (millimeters).
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         <p>This is a private symbol.
         @attr name android:footerIndicatorUnderlinePadding
         */
        public static final int TitlePageIndicator_footerIndicatorUnderlinePadding = 5;
        /**
         <p>
         @attr description
         Height of the footer line.


         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
         Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
         in (inches), mm (millimeters).
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         <p>This is a private symbol.
         @attr name android:footerLineHeight
         */
        public static final int TitlePageIndicator_footerLineHeight = 2;
        /**
         <p>
         @attr description
         Padding between the bottom of the title and the footer.


         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
         Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
         in (inches), mm (millimeters).
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         <p>This is a private symbol.
         @attr name android:footerPadding
         */
        public static final int TitlePageIndicator_footerPadding = 6;
        /**
         <p>
         @attr description
         Whether or not the selected item is displayed as bold.


         <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         <p>This is a private symbol.
         @attr name android:selectedBold
         */
        public static final int TitlePageIndicator_selectedBold = 8;
        /**
         <p>
         @attr description
         Color of the selected title.


         <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
         "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         <p>This is a private symbol.
         @attr name android:selectedColor
         */
        public static final int TitlePageIndicator_selectedColor = 7;
        /**
         <p>
         @attr description
         Color of regular titles.


         <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
         "<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         <p>This is a private symbol.
         @attr name android:textColor
         */
        public static final int TitlePageIndicator_textColor = 9;
        /**
         <p>
         @attr description
         Size of title text.


         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
         Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
         in (inches), mm (millimeters).
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         <p>This is a private symbol.
         @attr name android:textSize
         */
        public static final int TitlePageIndicator_textSize = 10;
        /**
         <p>
         @attr description
         Padding between titles when bumping into each other.


         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
         Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
         in (inches), mm (millimeters).
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         <p>This is a private symbol.
         @attr name android:titlePadding
         */
        public static final int TitlePageIndicator_titlePadding = 11;
        /**
         <p>
         @attr description
         Padding between titles and the top of the View.


         <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
         Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
         in (inches), mm (millimeters).
         <p>This may also be a reference to a resource (in the form
         "<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
         theme attribute (in the form
         "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
         containing a value of this type.
         <p>This is a private symbol.
         @attr name android:topPadding
         */
        public static final int TitlePageIndicator_topPadding = 12;
        /** Attributes that can be used with a ViewPagerIndicator.
         <p>Includes the following attributes:</p>
         <table>
         <colgroup align="left" />
         <colgroup align="left" />
         <tr><th>Attribute</th><th>Description</th></tr>
         <tr><td><code>{@link #ViewPagerIndicator_vpiCirclePageIndicatorStyle com.viewpagerindicator:vpiCirclePageIndicatorStyle}</code></td><td> Style of the circle indicator.</td></tr>
         <tr><td><code>{@link #ViewPagerIndicator_vpiTabPageIndicatorStyle com.viewpagerindicator:vpiTabPageIndicatorStyle}</code></td><td> Style of the tab indicator.</td></tr>
         <tr><td><code>{@link #ViewPagerIndicator_vpiTabTextStyle com.viewpagerindicator:vpiTabTextStyle}</code></td><td> Style of the text in a tab.</td></tr>
         <tr><td><code>{@link #ViewPagerIndicator_vpiTitlePageIndicatorStyle com.viewpagerindicator:vpiTitlePageIndicatorStyle}</code></td><td> Style of the title indicator.</td></tr>
         </table>
         @see #ViewPagerIndicator_vpiCirclePageIndicatorStyle
         @see #ViewPagerIndicator_vpiTabPageIndicatorStyle
         @see #ViewPagerIndicator_vpiTabTextStyle
         @see #ViewPagerIndicator_vpiTitlePageIndicatorStyle
         */
        public static final int[] ViewPagerIndicator = {
                0x7f010000, 0x7f010001, 0x7f010002, 0x7f010003
        };
        /**
         <p>
         @attr description
         Style of the circle indicator.


         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
         or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         <p>This is a private symbol.
         @attr name android:vpiCirclePageIndicatorStyle
         */
        public static final int ViewPagerIndicator_vpiCirclePageIndicatorStyle = 0;
        /**
         <p>
         @attr description
         Style of the tab indicator.


         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
         or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         <p>This is a private symbol.
         @attr name android:vpiTabPageIndicatorStyle
         */
        public static final int ViewPagerIndicator_vpiTabPageIndicatorStyle = 2;
        /**
         <p>
         @attr description
         Style of the text in a tab.


         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
         or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         <p>This is a private symbol.
         @attr name android:vpiTabTextStyle
         */
        public static final int ViewPagerIndicator_vpiTabTextStyle = 3;
        /**
         <p>
         @attr description
         Style of the title indicator.


         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
         or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         <p>This is a private symbol.
         @attr name android:vpiTitlePageIndicatorStyle
         */
        public static final int ViewPagerIndicator_vpiTitlePageIndicatorStyle = 1;
    };
}