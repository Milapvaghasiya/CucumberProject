package org.example;

import io.cucumber.java.an.E;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs{

    HomePage homePage = new HomePage();
    ResgistrationPage resgistrationPage = new ResgistrationPage();
    ResgistrationResultPage resgistrationResultPage = new ResgistrationResultPage();
    BuildYourComputer buildYourComputer =new BuildYourComputer();
    ComputerPage computerPage= new ComputerPage();
    Destop destop = new Destop();
    EmailAFriendPage emailAFriendPage=new EmailAFriendPage();
    Loadprop loadprop = new Loadprop();
    NewsCommentResult newsCommentResult= new NewsCommentResult();
    NewsCommentPage newsCommentPage= new NewsCommentPage();
    ReferProductToFriend referProductToFriend= new ReferProductToFriend();



    @Given("user is on registration page")
    public void user_is_on_registration_page() {
      homePage.clickOnTheRegister();

    }
    @When("user enter all required details")
    public void user_enter_all_required_details() {
        resgistrationPage.enterRegitrationDetails();

    }
    @When("user click on register submit button")
    public void user_click_on_register_submit_button() {

    }
    @Then("user should able to register successfully")
    public void user_should_able_to_register_successfully() {
       resgistrationResultPage.registrationResult();
    }
    @Given("user is on newsCommentPage")
    public void user_is_on_news_comment_page() {
        homePage.clickOnTheNewsComment();

    }
    @When("User Enter All the Requiement Details In the News Comment Page")
    public void user_enter_all_the_requiement_details_in_the_news_comment_page() {

        newsCommentPage.newsCommentAdd();


    }
    @When("click on News Comment Submit Button")
    public void click_on_news_comment_submit_button() {

    }
    @Then("user add news comment successfully")
    public void user_add_news_comment_successfully() {
        newsCommentResult.verifyUserHAsSuccessFullyCommentAdded();

    }
    @Given("user is on refer a friend")
    public void user_is_on_refer_a_friend() {
        homePage.clickOnTheRegister();
        resgistrationPage.enterRegitrationDetails();
        resgistrationResultPage.registrationResult();
        resgistrationResultPage.clcikonContinueInTheRegistrationPage();


    }
    @When("User Enter All the Requrement Details In the refer a friend")
    public void user_enter_all_the_requrement_details_in_the_refer_a_friend() {
        destop.clickOnBuildYourOwnButton();
        buildYourComputer.veryfyuserisonbuildyourComputerpage();

    }
    @When("click on refer a friend Submit Button")
    public void click_on_refer_a_friend_submit_button() {
        emailAFriendPage.DetailstoAddForReferProduct();

    }
    @Then("user should be able refer a friend successfully")
    public void user_should_be_able_refer_a_friend_successfully() {
        referProductToFriend.usershouldBeAnletoSendemailtoFfiendSuccessfully();

    }
    @Given("User is in home page")
    public void user_is_in_home_page() {
        homePage.clickOnTheNewsComment();
    }
    @When("user click on computers")
    public void user_click_on_computers() {
        newsCommentPage.newsCommentAdd();

    }
    @Then("user should able to see  navigate  page")
    public void user_should_able_to_see_navigate_page() {
        newsCommentResult.verifyUserHAsSuccessFullyCommentAdded();

    }

}
