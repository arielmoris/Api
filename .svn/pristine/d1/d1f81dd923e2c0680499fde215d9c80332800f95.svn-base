package pt.api;

import java.math.BigDecimal;
import java.util.List;

import pt.api.bean.Pagination;
import pt.api.bean.Total;
import pt.api.bean._3RDPContainer;
import pt.api.player.balance.PlayerBalance;
import pt.api.player.balance.PlayerBalanceRequest;
import pt.api.player.balance.PlayerBalanceResponse;
import pt.api.player.balance.PlayerBalanceResult;
import pt.api.player.checktransaction.PlayerCheckTransaction;
import pt.api.player.checktransaction.PlayerCheckTransactionRequest;
import pt.api.player.checktransaction.PlayerCheckTransactionResponse;
import pt.api.player.checktransaction.PlayerCheckTransactionResult;
import pt.api.player.create.PlayerCreate;
import pt.api.player.create.PlayerCreateRequest;
import pt.api.player.create.PlayerCreateResponse;
import pt.api.player.create.PlayerCreateResult;
import pt.api.player.deposit.PlayerDeposit;
import pt.api.player.deposit.PlayerDepositRequest;
import pt.api.player.deposit.PlayerDepositResponse;
import pt.api.player.deposit.PlayerDepositResult;
import pt.api.player.info.PlayerInfo;
import pt.api.player.info.PlayerInfoRequest;
import pt.api.player.info.PlayerInfoResponse;
import pt.api.player.info.PlayerInfoResult;
import pt.api.player.isplayeronline.IsPlayerOnline;
import pt.api.player.isplayeronline.IsPlayerOnlineRequest;
import pt.api.player.isplayeronline.IsPlayerOnlineResponse;
import pt.api.player.isplayeronline.IsPlayerOnlineResult;
import pt.api.player.list.PlayerList;
import pt.api.player.list.PlayerListRequest;
import pt.api.player.list.PlayerListResponse;
import pt.api.player.list.PlayerListResult;
import pt.api.player.logoutplayer.LogoutPlayer;
import pt.api.player.logoutplayer.LogoutPlayerRequest;
import pt.api.player.logoutplayer.LogoutPlayerResponse;
import pt.api.player.logoutplayer.LogoutPlayerResult;
import pt.api.player.resetfailedlogin.PlayerResetFailedLogin;
import pt.api.player.resetfailedlogin.PlayerResetFailedLoginRequest;
import pt.api.player.resetfailedlogin.PlayerResetFailedLoginResponse;
import pt.api.player.resetfailedlogin.PlayerResetFailedLoginResult;
import pt.api.player.update.PlayerUpdate;
import pt.api.player.update.PlayerUpdateRequest;
import pt.api.player.update.PlayerUpdateResponse;
import pt.api.player.update.PlayerUpdateResult;
import pt.api.player.withdraw.PlayerWithdraw;
import pt.api.player.withdraw.PlayerWithdrawRequest;
import pt.api.player.withdraw.PlayerWithdrawResponse;
import pt.api.player.withdraw.PlayerWithdrawResult;
/**
 * Tester
 *
 */
public class App 
{
	
    public static void main( String[] args ){
    	try {
//			playerBalance();
//			checkTransaction();
//			playerCreate();
			playerDeposit();
//			playerInfo();
//			isPlayerOnline();
//			playerList();
//			logoutPlayer();
//			resetFailedLogin();
//			update();
//			withdraw();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public static void playerBalance() throws Exception{
    	String baseUrl="http://localhost:7070/";
    	String entityKey="SDF80sdf";
    	
    	PlayerBalanceRequest request = new PlayerBalanceRequest();
    	request.setPlayername("");
    	
    	PlayerBalanceResponse response = PlayerBalance.call(baseUrl, request, entityKey);
    	
    	if(response.getErrorcode() == null){ //Success
    		System.out.println("Success");
    		PlayerBalanceResult result = response.getResult();
        	if(result != null){
        		result.getBalance();
        		result.getBonusbalance();
        		result.getCurrencycode();
        		result.getPlayername();
        	}
    	}else{ //Error 
    		System.out.println("Error");
    		response.getError();
    		response.getErrorcode();
    	}
    	
    }
    
    public static void checkTransaction() throws Exception{
    	String baseUrl="http://localhost:7070/";
    	String entityKey="SDF80sdf";
    	
    	PlayerCheckTransactionRequest request = new PlayerCheckTransactionRequest();
    	request.setExternaltransactionid("");
    	
    	PlayerCheckTransactionResponse response = PlayerCheckTransaction.call(baseUrl, request, entityKey);
    	
    	if(response.getErrorcode() == null){ //Success
    		PlayerCheckTransactionResult result = response.getResult();
        	if(result != null){
        		result.getAmount();
            	result.getCurrentplayerbalance();
            	result.getExecutiontime();
            	result.getExternaltransactionid();
            	result.getIp();
            	result.getKiosktransactionid();
            	result.getKiosktransactiontime();
            	result.getPtinternaltransactionid();
            	result.getStatus();
        	}
    	}else{ //Error 
    		response.getError();
    		response.getErrorcode();
    	}
    	
    }
    
    public static void playerCreate() throws Exception{
    	String baseUrl="http://localhost:7070/";
    	String entityKey="SDF80sdf";
    	
    	PlayerCreateRequest request = new PlayerCreateRequest();
    	request.set_3rDPContainer(new _3RDPContainer());
    	request.setAddress("");
    	request.setAdminname("");
    	request.setBirthdate("");
    	request.setCity("");
    	request.setComments("");
    	request.setCountrycode("");
    	request.setCustom02("");
    	request.setCustom03("");
    	request.setCustom04("");
    	request.setCustom05("");
    	request.setCustom06("");
    	request.setCustom07("");
    	request.setCustom08("");
    	request.setCustom09("");
    	request.setCustom10("");
    	request.setCustom11("");
    	request.setCustom12("");
    	request.setCustom13("");
    	request.setCustom14("");
    	request.setCustom15("");
    	request.setCustom16("");
    	request.setCustom17("");
    	request.setCustom18("");
    	request.setCustom19("");
    	request.setCustom20("");
    	request.setEmail("");
    	request.setFax("");;
    	request.setFirstname("");
    	request.setKioskname("");
    	request.setLanguagecode("");
    	request.setLastname("");
    	request.setNickname("");
    	request.setPassword("");
    	request.setPhone("");
    	request.setPlayername("");
    	request.setSex(0);
    	request.setState("");
    	request.setTrackingid("");
    	request.setViplevel(1);
    	request.setZip("");
    	
    	PlayerCreateResponse response = PlayerCreate.call(baseUrl, request, entityKey);
    	
    	if(response.getErrorcode() == null){ //Success
    		System.out.println("Success");
    		PlayerCreateResult result = response.getResult();
        	if(result != null){
        		result.getPlayerName();
        		result.getResult();
        	}
    	}else{ //Error 
    		System.out.println("Error");
    		response.getError();
    		response.getErrorcode();
    	}
    }
    
    public static void playerDeposit() throws Exception{
    	String baseUrl="http://localhost:7070/";
    	String entityKey="SDF80sdf";
    	
    	PlayerDepositRequest request = new PlayerDepositRequest();
    	request.setPlayername("");
    	request.setAdminname("");
    	request.setExternaltranid("");
    	request.setAmount("");
    	
    	
    	PlayerDepositResponse response = PlayerDeposit.call(baseUrl, request, entityKey);
    	Integer errorCode = response.getErrorcode();
    	if(errorCode == null){ //Success
    		System.out.println("Success");
    		PlayerDepositResult result = response.getResult();
        	if(result != null){
        		result.getAmount();
        		result.getCurrentplayerbalance();
        		result.getExecutiontime();
        		result.getExternaltransactionid();
        		result.getInstantcashtype();
        		result.getKiosktransactionid();
        		result.getKiosktransactiontime();
        		result.getPtinternaltransactionid();
        		result.getResult();
        	}
    	}else{ //Error 
    		System.out.println("Error");
    		response.getError();
    		response.getErrorcode();
    	}
    	
    }
    
    public static void playerInfo() throws Exception{
    	String baseUrl="http://localhost:7070/";
    	String entityKey="SDF80sdf";
    	
    	PlayerInfoRequest request = new PlayerInfoRequest();
    	request.setPlayername("");
    	request.setWith3RDPData(1);
    	
    	
    	PlayerInfoResponse response = PlayerInfo.call(baseUrl, request, entityKey);
    
    	if(response.getErrorcode() == null){ //Success
    		System.out.println("Success");
    		PlayerInfoResult result = response.getResult();
        	if(result != null){
        		result.get_3RDPData();
        		result.getADDRESS();
        		result.getADVERTISER();
        		result.getBALANCE();
        		result.getBANNERID();
        		result.getBIRTHDATE();
        		result.getBONUSBALANCE();
        		result.getCASINOCODE();
        		result.getCASINONAME();
        		result.getCASINONICKNAME();
        		result.getCITY();
        		result.getCLIENTSKIN();
        		result.getCLIENTTYPE();
        		result.getCODE();
        		result.getCOMPPOINTS();
        		result.getCOUNTRYCODE();
        		result.getCREFERER();
        		result.getCURRENCY();
        		result.getCURRENCYCODE();
        		result.getCURRENTBET();
        		result.getCURRENTBONUSBET();
        		result.getEMAIL();
        		result.getFAX();
        		result.getFIRSTNAME();
        		result.getFROZEN();
        		result.getFULLFIRSTNAME();
        		result.getFULLFIRSTSURNAME();
        		result.getFULLSECONDSURNAME();
        		result.getINTERNAL();
        		result.getISINGAME();
        		result.getKIOSKADMINCODE();
        		result.getKIOSKADMINNAME();
        		result.getKIOSKCODE();
        		result.getKIOSKNAME();
        		result.getLANGUAGECODE();
        		result.getLASTNAME();
        		result.getLOCKEDMINUTES();
        		result.getMAXBALANCE();
        		result.getNETWORKNICKNAMES();
        		result.getNOBONUS();
        		result.getOCCUPATION();
        		result.getPASSWORD();
        		result.getPENDINGBONUSBALANCE();
        		result.getPHONE();
        		result.getPLAYERNAME();
        		result.getOCCUPATION();
        		result.getRESERVEDBALANCE();
        		result.getSERIAL();
        		result.getSEX();
        		result.getSIGNUPCLIENTPLATFORM();
        		result.getSIGNUPCLIENTVERSION();
        		result.getSIGNUPDATE();
        		result.getSTATE();
        		result.getSUSPENDED();
        		result.getTAXRESIDENCEREGION();
        		result.getTOTALCOMPPOINTS();
        		result.getTRACKINGID();
        		result.getVIPLEVEL();
        		result.getWANTMAIL();
        		result.getZIP();
        	}
    	}else{ //Error 
    		System.out.println("Error");
    		response.getError();
    		response.getErrorcode();
    	}
    }
    
    public static void isPlayerOnline() throws Exception{
    	String baseUrl="http://localhost:7070/";
    	String entityKey="SDF80sdf";
    	
    	IsPlayerOnlineRequest request = new IsPlayerOnlineRequest();
    	request.setPlayername("");
    	
    	
    	IsPlayerOnlineResponse response = IsPlayerOnline.call(baseUrl, request, entityKey);
    	
    	if(response.getErrorcode() == null){ //Success
    		IsPlayerOnlineResult result = response.getResult();
        	if(result != null){
        		result.getResult();
        	}
    	}else{ //Error 
    		response.getError();
    		response.getErrorcode();
    	}
    }
    
    public static void playerList() throws Exception{
    	String baseUrl="http://localhost:7070/";
    	String entityKey="SDF80sdf";
    	PlayerListRequest request = new PlayerListRequest();
    	request.setAdminname("");
    	request.setKioskname("");
    	request.setOnline(false);
    	request.setPage(0);
    	request.setPerPage(0);

    	PlayerListResponse response = PlayerList.call(baseUrl, request, entityKey);

    	if(response.getErrorcode() == null){ //Success
    		System.out.println("Success");
    		Pagination page = response.getPagination();
    		if(page != null){
    			page.getCurrentPage();
            	page.getItemsPerPage();
            	page.getTotalPages();
    		}

        	Total total = response.getTotal();
        	if(total != null){
        		total.getTotalBalance();
            	total.getTotalBonusBalance();
            	total.getTotalCount();
        	}
        	
        	List<PlayerListResult> result =  response.getResult();
        	for (PlayerListResult data : result){
        		data.getADMINNAME();
        		data.getBALANCE();
        		data.getBONUSBALANCE();
        		data.getFROZEN();
        		data.getIP();
        		data.getKIOSKNAME();
        		data.getLASTLOGINDATE();
        		data.getPLAYERNAME();
        		data.getSIGNUPDATE();
        		data.getVIPLEVEL();
        	}
    	}else{ //Error 
    		System.out.println("Error");
    		response.getError();
    		response.getErrorcode();
    	}
    }
    
    public static void logoutPlayer() throws Exception{
    	String baseUrl="http://localhost:7070/";
    	String entityKey="SDF80sdf";
    	LogoutPlayerRequest request = new LogoutPlayerRequest();
    	request.setPlayername("");

    	LogoutPlayerResponse response = LogoutPlayer.call(baseUrl, request, entityKey);
    	if(response.getErrorcode() == null){ //Success
    		System.out.println("Success");
    		LogoutPlayerResult res = response.getResult();
    		if(res != null)
    			res.getResult();
    	}else{ //Error 
    		System.out.println("Error");
    		response.getError();
    		response.getErrorcode();
    	}
    	
    	
    }
    
    public static void resetFailedLogin() throws Exception{
    	String baseUrl="http://localhost:7070/";
    	String entityKey="SDF80sdf";
    	PlayerResetFailedLoginRequest request = new PlayerResetFailedLoginRequest();
    	request.setPlayername("");

    	PlayerResetFailedLoginResponse response = PlayerResetFailedLogin.call(baseUrl, request, entityKey);
    	if(response.getErrorcode() == null){ //Success
    		System.out.println("Success");
    		PlayerResetFailedLoginResult res = response.getResult();
    		if(res != null)
    			res.getResult();
    	}else{ //Error
    		System.out.println("Error");
    		response.getError();
    		response.getErrorcode();
    	}
    }
    
    public static void update() throws Exception{
    	String baseUrl="http://localhost:7070/";
    	String entityKey="SDF80sdf";
    	PlayerUpdateRequest request = new PlayerUpdateRequest();
    	request.setAddress("");
    	request.setBirthdate("");
    	request.setCity("");
    	request.setComments("");
    	request.setCountrycode("");
    	request.setCustom02("");
    	request.setCustom03("");
    	request.setCustom04("");
    	request.setCustom05("");
    	request.setCustom06("");
    	request.setCustom07("");
    	request.setCustom08("");
    	request.setCustom09("");
    	request.setCustom10("");
    	request.setCustom11("");
    	request.setCustom12("");
    	request.setCustom13("");
    	request.setCustom14("");
    	request.setCustom15("");
    	request.setCustom16("");
    	request.setCustom17("");
    	request.setCustom18("");
    	request.setCustom19("");
    	request.setCustom20("");
    	request.setEmail("");
    	request.setFax("");
    	request.setFirstname("");
    	request.setFirstname("");
    	request.setFrozen(0);
    	request.setLanguagecode("");
    	request.setLastname("");
    	request.setPassword("");
    	request.setPhone("");
    	request.setPlayername("");
    	request.setSex(0);
    	request.setState("");
    	request.setTrackingId("");
    	request.setViplevel(0);
    	request.setZip("");
    	
    	PlayerUpdateResponse response = PlayerUpdate.call(baseUrl, request, entityKey);
    	if(response.getErrorcode() == null){ //Success
    		System.out.println("Success");
    		PlayerUpdateResult res = response.getResult();
    		if(res != null){
    			res.getResult();
    		}
    	}else{ //Error 
    		System.out.println("Error");
    		response.getError();
    		response.getErrorcode();
    	}
    }
    
    
    public static void withdraw() throws Exception{
    	String baseUrl="http://localhost:7070/";
    	String entityKey="SDF80sdf";
    	PlayerWithdrawRequest request = new PlayerWithdrawRequest();
    	request.setAdminname("");
    	request.setAmount(BigDecimal.ZERO);
    	request.setExternaltranid("");
    	request.setIsForce("");
    	request.setLosebonus(false);
    	request.setPlayername("");
    	
    	PlayerWithdrawResponse response = PlayerWithdraw.call(baseUrl, request, entityKey);
    	if(response.getErrorcode() == null){ //Success
    		System.out.println("Success");
    		PlayerWithdrawResult res = response.getResult();
    		if(res != null){
    			res.getAmount();
            	res.getCurrentplayerbalance();
            	res.getExecutiontime();
            	res.getExternaltransactionid();
            	res.getInstantcashtype();
            	res.getKiosktransactionid();
            	res.getKiosktransactiontime();
            	res.getPtinternaltransactionid();
            	res.getResult();
    		}
        	
    	}else{ //Error
    		System.out.println("Error");
    		response.getError();
    		response.getErrorcode();
    	}
    }
}
