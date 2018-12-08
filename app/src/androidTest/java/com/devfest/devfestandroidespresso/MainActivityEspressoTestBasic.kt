package com.devfest.devfestandroidespresso


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityEspressoTestBasic {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)


    @Test
    fun testUserNameLabelIsDisplayed() {
        onView(withText("Username"))
            .check(matches(isDisplayed()))
    }


    @Test
    fun testPasswordLabelIsDisplayed() {
        onView(withText("Password"))
            .check(matches(isDisplayed()))
    }
}
