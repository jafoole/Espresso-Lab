package com.example.jafoole.espressolab;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by
 *  /\     /\      __        _____              __                /\      /\
 * \ \    \ \     |__|____ _/ ____\____   ____ |  |   ____       / /     / /
 * \ \    \ \     |  \__  \\   __\/  _ \ /  _ \|  | _/ __ \     / /     / /
 * \ \    \ \     |  |/ __ \|  | (  <_> |  <_> )  |_\  ___/    / /     / /
 * \ \    \ \ /\__|  (____  /__|  \____/ \____/|____/\___  >  / /     / /
 * \/     \/  \______|    \/                             \/   \/      \/
 * on 3/28/16.
 */

@RunWith(AndroidJUnit4.class)
public class BalanceActivityTest {


    @Rule
    public ActivityTestRule<BalanceActivity> mActivityRule
            = new ActivityTestRule<BalanceActivity>(BalanceActivity.class);

    @Test
    public void testIfAllDisplayed() throws Exception {
        onView(withId(R.id.currentBalanceText)).check(matches(isDisplayed()));
        onView(withId(R.id.currentBalanceView)).check(matches(isDisplayed()));
        onView(withId(R.id.decreaseButton)).check(matches(isDisplayed()));
        onView(withId(R.id.increaseButton)).check(matches(isDisplayed()));
        onView(withId(R.id.userName)).check(matches(isDisplayed()));
    }

    @Test
    public void testViewBalance() throws Exception {
        onView(withId(R.id.currentBalanceView)).check(matches(isDisplayed()));

    }
//
    @Test
    public void testUserNameClickable() throws Exception {
        onView(withId(R.id.userName)).perform(click());
    }

    @Test
    public void testIncreaseButtonClicked() throws Exception {
        String value1 = "100";

        String expectedValue = "100";

        onView(withId(R.id.addBalance)).perform(typeText(value1), closeSoftKeyboard());

    }


    @Test
    public void testDecreaseButtonClicked() throws Exception {
        String value1 = "100";

        String expectedValue = "0";

        onView(withId(R.id.addBalance)).perform(typeText(value1), closeSoftKeyboard());
    }
}
