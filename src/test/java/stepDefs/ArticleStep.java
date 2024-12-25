package stepDefs;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArticlePage;

public class ArticleStep {
	WebDriver driver;
	ArticlePage articlepage;
	
	@Given("User should be on New Article Page")
	public void user_should_be_on_new_article_page() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    articlepage=new ArticlePage(driver);
	    
	    
	}

	@When("enters Article details")
	public void enters_article_details(io.cucumber.datatable.DataTable dataTable) {
	    Map<String, String> data =dataTable.asMap(String.class, String.class);
	    

	    articlepage.clickArticle();
	    articlepage.createArticle(data.get("title"), data.get("Desc"), data.get("Content"), data.get("tag"));
	}

	@Then("Article must be created")
	public void article_must_be_created() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

//	@Given("User should be on Global Feed page")
//	public void user_should_be_on_global_feed_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("enters select an article {string}")
//	public void enters_select_an_article(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Article details page must be created")
//	public void article_details_page_must_be_created() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("Article detail page must be displayed")
//	public void article_detail_page_must_be_displayed() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User update article details")
//	public void user_update_article_details() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Article details page must be updated")
//	public void article_details_page_must_be_updated() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User Delete article")
//	public void user_delete_article() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Article must be deleted")
//	public void article_must_be_deleted() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
}
