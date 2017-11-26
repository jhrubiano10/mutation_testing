package org.gnucash.android.ui.account;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.gnucash.android.R;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.action.ViewActions.swipeLeft;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class DateRangePickerDialogFragment_316 {

    @Rule
    public ActivityTestRule<AccountsActivity> mActivityTestRule = new ActivityTestRule<>(AccountsActivity.class);

    @Test
    public void dateRangePickerDialogFragment_316() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btn_save), withText("Next"), isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction viewPager = onView(
                allOf(withId(R.id.pager), isDisplayed()));
        viewPager.perform(swipeLeft());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.btn_save), withText("Next"), isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction viewPager2 = onView(
                allOf(withId(R.id.pager), isDisplayed()));
        viewPager2.perform(swipeLeft());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.btn_save), withText("Next"), isDisplayed()));
        appCompatButton3.perform(click());

        ViewInteraction viewPager3 = onView(
                allOf(withId(R.id.pager), isDisplayed()));
        viewPager3.perform(swipeLeft());

        ViewInteraction appCompatCheckedTextView = onView(
                allOf(withId(android.R.id.text1), withText("Disable crash reports"),
                        childAtPosition(
                                withId(android.R.id.list),
                                1),
                        isDisplayed()));
        appCompatCheckedTextView.perform(click());

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.btn_save), withText("Next"), isDisplayed()));
        appCompatButton4.perform(click());

        ViewInteraction viewPager4 = onView(
                allOf(withId(R.id.pager), isDisplayed()));
        viewPager4.perform(swipeLeft());

        ViewInteraction appCompatButton5 = onView(
                allOf(withId(R.id.btn_save), withText("Done"), isDisplayed()));
        appCompatButton5.perform(click());

        ViewInteraction appCompatButton6 = onView(
                allOf(withId(android.R.id.button1), withText("Dismiss"),
                        withParent(allOf(withClassName(is("com.android.internal.widget.ButtonBarLayout")),
                                withParent(withClassName(is("android.widget.LinearLayout"))))),
                        isDisplayed()));
        appCompatButton6.perform(click());

        ViewInteraction cardView = onView(
                allOf(withClassName(is("android.support.v7.widget.CardView")),
                        withParent(allOf(withId(R.id.account_recycler_view),
                                withParent(withId(R.id.fragment_account_list)))),
                        isDisplayed()));
        cardView.perform(click());

        ViewInteraction appCompatImageView = onView(
                allOf(withId(R.id.create_transaction), isDisplayed()));
        appCompatImageView.perform(click());

        ViewInteraction appCompatAutoCompleteTextView = onView(
                withId(R.id.input_transaction_name));
        appCompatAutoCompleteTextView.perform(scrollTo(), click());

        ViewInteraction appCompatAutoCompleteTextView2 = onView(
                withId(R.id.input_transaction_name));
        appCompatAutoCompleteTextView2.perform(scrollTo(), replaceText("Test"), closeSoftKeyboard());

        ViewInteraction calculatorEditText = onView(
                withId(R.id.input_transaction_amount));
        calculatorEditText.perform(scrollTo(), click());

        ViewInteraction calculatorEditText2 = onView(
                withId(R.id.input_transaction_amount));
        calculatorEditText2.perform(scrollTo(), replaceText("10"), closeSoftKeyboard());

        ViewInteraction appCompatTextView = onView(
                allOf(withId(R.id.input_date), withText("Nov 26, 2017")));
        appCompatTextView.perform(scrollTo(), click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ViewInteraction appCompatButton7 = onView(
                allOf(withId(R.id.done_button), withText("OK"),
                        withParent(withId(R.id.ok_cancel_buttons_layout)),
                        isDisplayed()));
        appCompatButton7.perform(click());

        ViewInteraction appCompatTextView2 = onView(
                allOf(withId(R.id.input_recurrence), withText("Tap to create schedule")));
        appCompatTextView2.perform(scrollTo(), click());

        ViewInteraction switchCompat = onView(
                withId(R.id.repeat_switch));
        switchCompat.perform(scrollTo(), click());

        ViewInteraction weekButton = onView(
                allOf(withText("Mon"),
                        withParent(allOf(withId(R.id.weekGroup),
                                withParent(withId(R.id.options))))));
        weekButton.perform(scrollTo(), click());

        ViewInteraction appCompatButton8 = onView(
                allOf(withId(R.id.done_button), withText("OK"),
                        withParent(withId(R.id.ok_cancel_buttons_layout)),
                        isDisplayed()));
        appCompatButton8.perform(click());

        ViewInteraction actionMenuItemView = onView(
                allOf(withId(R.id.menu_save), withText("Save"), withContentDescription("Save"), isDisplayed()));
        actionMenuItemView.perform(click());

        ViewInteraction appCompatImageButton = onView(
                allOf(withContentDescription("Navigation drawer opened"),
                        withParent(withId(R.id.toolbar)),
                        isDisplayed()));
        appCompatImageButton.perform(click());

        ViewInteraction appCompatCheckedTextView2 = onView(
                allOf(withId(R.id.design_menu_item_text), withText("Scheduled Actions"), isDisplayed()));
        appCompatCheckedTextView2.perform(click());

        ViewInteraction checkableLinearLayout = onView(
                allOf(childAtPosition(
                        withId(android.R.id.list),
                        0),
                        isDisplayed()));
        checkableLinearLayout.perform(click());

        ViewInteraction appCompatTextView3 = onView(
                allOf(withId(R.id.input_date), withText("Nov 20, 2017")));
        appCompatTextView3.perform(scrollTo(), click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ViewInteraction appCompatButton9 = onView(
                allOf(withId(R.id.done_button), withText("OK"),
                        withParent(withId(R.id.ok_cancel_buttons_layout)),
                        isDisplayed()));
        appCompatButton9.perform(click());

        ViewInteraction actionMenuItemView2 = onView(
                allOf(withId(R.id.menu_save), withText("Save"), withContentDescription("Save"), isDisplayed()));
        actionMenuItemView2.perform(click());

    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
