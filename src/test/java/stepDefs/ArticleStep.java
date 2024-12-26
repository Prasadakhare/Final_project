
package stepDefs;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArticlePage;

public class ArticleStep {
	WebDriver driver=TestBase.getDriver();
	ArticlePage articlepage;
	
	public ArticleStep() {
		  articlepage=new ArticlePage(driver);
	}
	
	@Given("User should be on New Article Page")
	public void user_should_be_on_new_article_page() {
	  
		TestBase.openUrl("https://conduit-realworld-example-app.fly.dev/");
	    
	}

	@When("enters Article details")
	public void enters_article_details(io.cucumber.datatable.DataTable dataTable) throws InterruptedException  {
	    List<Map<String, String>> data =dataTable.asMaps();
	    

//	    articlepage.clickArticle();

	    	
			articlepage.createArticle(data.get(0).get("title"), data.get(0).get("Desc"),data.get(0).get("Content"),data.get(0).get("tag"));
			
	}

	@Then("Article must be created")
	public void article_must_be_created() {

	}

	//Global Feed Page
	@Given("User should be on Global Feed page")
	public void user_should_be_on_global_feed_page() {
	   articlepage.globalFeed();
	}

	@When("enters select an article {string}")
	public void enters_select_an_article(String string) {
	    
	}

	@Then("Article details page must be created")
	public void article_details_page_must_be_created() {
	    
	}
	
	
	
//Update OR Edit Article

		@Given("Article detail page must be displayed")
		public void article_detail_page_must_be_displayed() {
//				updateArticlepage.editClickArticle();
			
			
		}

		@When("User update article details")
		public void user_update_article_details(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
			List<Map<String, String>> data = dataTable.asMaps();
		    
		    // Assuming the first row contains the article details
		    articlepage.updateArticle(data.get(0).get("title"), data.get(0).get("Desc"), data.get(0).get("Content"));
		}

		@Then("Article details page must be updated")
		public void article_details_page_must_be_updated() {
		   
		}
	
	@When("User Delete article")
	public void user_delete_article() {
		
		articlepage.deleteArticle();
		
	}

	@Then("Article must be deleted")
	public void article_must_be_deleted() {
	   
	}
}
