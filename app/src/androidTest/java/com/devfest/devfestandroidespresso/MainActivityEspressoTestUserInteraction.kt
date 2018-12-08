package com.devfest.devfestandroidespresso


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.replaceText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityEspressoTestUserInteraction {

    @get:Rule
    var intentsRule: IntentsTestRule<MainActivity> = IntentsTestRule(MainActivity::class.java)


//    @Test
//    fun testUserNameLabelIsDisplayed() {
//        onView(withText("Username"))
//            .check(matches(isDisplayed()))
//    }
//
//
//    @Test
//    fun testPasswordLabelIsDisplayed() {
//        onView(withText("Password"))
//            .check(matches(isDisplayed()))
//    }

    @Test
    fun testSignInButtonClick() {

        val userName = "devFestAdmin"
        val packageName = "com.devfest.devfestandroidespresso"

        onView(withId(R.id.etUsername))
            .perform(replaceText(userName))

        onView(withId(R.id.btnSignIn))
            .perform(click())

        intended(hasComponent(HomeActivity::class.java.name))


        onView(withId(R.id.tvWelcome))
            .perform(click())
            .check(matches(isDisplayed()))

    }

}
