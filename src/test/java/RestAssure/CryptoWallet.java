package RestAssure;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class CryptoWallet {

	String url = "https://crypto-wallet-server.mock.beeceptor.com";
	
// Register a user, and create his/her wallet
	

	@Test(enabled = false)

	public void AddNewComment() {
		   
		   JSONObject js = new JSONObject();
		   
		   js.put("username","user123");
		   js.put("password","securepassword");
		   js.put("email","user@example.com");
		   
		   given().contentType("application/json").body(js.toJSONString()).when().post("https://crypto-wallet-server.mock.beeceptor.com/api/v1/register").then().log().all();
	}
	
	
//Login the user and generate a session token

		@Test(enabled = false)

		public void LoginGenerateToken() {
			   
			   JSONObject js = new JSONObject();
			   
			   js.put("username","user123");
			   js.put("password","securepassword");
			   
			   
			   given().contentType("application/json").body(js.toJSONString()).when().post("https://crypto-wallet-server.mock.beeceptor.com/api/v1/login").then().log().all();
		}

//Retrieve the wallet balance
		
    @Test(enabled = false)
    
    public void RetriveWalletBalance() {
    	
    	given().get("https://crypto-wallet-server.mock.beeceptor.com/api/v1/balance").then().statusCode(200).log().all();
    }
    
    
//List all the transactions done by the user
    
    @Test(enabled = false)
    
    public void UserTransactionLists() {
    	
    	given().get("https://crypto-wallet-server.mock.beeceptor.com/api/v1/transactions").then().statusCode(200).log().all();
    }
    
 
  //Transfer 5 ETH to a recipient
 

  		@Test(enabled = false)

  		public void Transfer5ETHRecipient() {
  			   
  			   JSONObject js = new JSONObject();
  			   
  			   js.put("recipient_address","0x1234567890ABCDEF");
  			   js.put("amount","5.0");
  			   js.put("currency","ETH");
  			   
  			  given().contentType("application/json").body(js.toJSONString()).when().post("https://crypto-wallet-server.mock.beeceptor.com/api/v1/transactions").then().log().all();
  					
  		}			
  		
 
//Calculate transaction fees and return estimated cost
  		 
  		@Test(enabled = false)

  		public void CalculateTransactionFee() {
  			   
  			   JSONObject js = new JSONObject();
  			   
  			   js.put("amount","2.5");
  			   js.put("currency","BTC");
  			   js.put("recipient_address","0x1234567890ABCDEF");
  			   
  			  given().contentType("application/json").body(js.toJSONString()).when().post("https://crypto-wallet-server.mock.beeceptor.com/api/v1/transaction_fee").then().log().all();
  					
  		}		
//Get an object with all available currency exchange rates
    
    @Test(enabled = true)
    
    public void GetObjectWithAvailableCurrency() {
    	
    	given().get("https://crypto-wallet-server.mock.beeceptor.com/api/v1/exchange_rates").then().statusCode(200).log().all();
    }
}
