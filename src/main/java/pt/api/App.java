package pt.api;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import pt.api.bean.ConnectionProperties;
import pt.api.bean.Pagination;
import pt.api.bean.Total;
import pt.api.bean._3RDPContainer;
import pt.api.entity.generatekey.GenerateKey;
import pt.api.entity.generatekey.GenerateKeyRequest;
import pt.api.entity.generatekey.GenerateKeyResponse;
import pt.api.entity.generatekey.GenerateKeyResult;
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
import pt.api.player.masscreate.PlayerMassCreate;
import pt.api.player.masscreate.PlayerMassCreateCreate;
import pt.api.player.masscreate.PlayerMassCreateDeposit;
import pt.api.player.masscreate.PlayerMassCreateParam;
import pt.api.player.masscreate.PlayerMassCreateRequest;
import pt.api.player.masscreate.PlayerMassCreateResponse;
import pt.api.player.masscreate.PlayerMassCreateResult;
import pt.api.player.massdeposit.PlayerMassDeposit;
import pt.api.player.massdeposit.PlayerMassDepositDeposit;
import pt.api.player.massdeposit.PlayerMassDepositParam;
import pt.api.player.massdeposit.PlayerMassDepositRequest;
import pt.api.player.massdeposit.PlayerMassDepositResponse;
import pt.api.player.massdeposit.PlayerMassDepositResult;
import pt.api.player.massfreeze.PlayerMassFreeze;
import pt.api.player.massfreeze.PlayerMassFreezeFreeze;
import pt.api.player.massfreeze.PlayerMassFreezeParam;
import pt.api.player.massfreeze.PlayerMassFreezeRequest;
import pt.api.player.massfreeze.PlayerMassFreezeResponse;
import pt.api.player.massfreeze.PlayerMassFreezeResult;
import pt.api.player.massfreeze.PlayerMassFreezeWithdraw;
import pt.api.player.masslogout.PlayerMassLogout;
import pt.api.player.masslogout.PlayerMassLogoutLogout;
import pt.api.player.masslogout.PlayerMassLogoutParam;
import pt.api.player.masslogout.PlayerMassLogoutRequest;
import pt.api.player.masslogout.PlayerMassLogoutResponse;
import pt.api.player.masslogout.PlayerMassLogoutResult;
import pt.api.player.massupdate.PlayerMassUpdate;
import pt.api.player.massupdate.PlayerMassUpdateParam;
import pt.api.player.massupdate.PlayerMassUpdateRequest;
import pt.api.player.massupdate.PlayerMassUpdateResponse;
import pt.api.player.massupdate.PlayerMassUpdateResult;
import pt.api.player.massupdate.PlayerMassUpdateUpdate;
import pt.api.player.masswithdraw.PlayerMassWithdraw;
import pt.api.player.masswithdraw.PlayerMassWithdrawParam;
import pt.api.player.masswithdraw.PlayerMassWithdrawRequest;
import pt.api.player.masswithdraw.PlayerMassWithdrawResponse;
import pt.api.player.masswithdraw.PlayerMassWithdrawResult;
import pt.api.player.masswithdraw.PlayerMassWithdrawWithdraw;
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
import pt.api.report.gamestats.GameStats;
import pt.api.report.gamestats.GameStatsRequest;
import pt.api.report.gamestats.GameStatsResponse;
import pt.api.report.gamestats.GameStatsResult;
import pt.api.report.playergames.PlayerGames;
import pt.api.report.playergames.PlayerGamesRequest;
import pt.api.report.playergames.PlayerGamesResponse;
import pt.api.report.playergames.PlayerGamesResult;
import pt.api.report.playergamescount.PlayerGamesCount;
import pt.api.report.playergamescount.PlayerGamesCountRequest;
import pt.api.report.playergamescount.PlayerGamesCountResponse;
import pt.api.report.playergamescount.PlayerGamesCountResult;
import pt.api.report.playersaccountstats.PlayersAccountStats;
import pt.api.report.playersaccountstats.PlayersAccountStatsRequest;
import pt.api.report.playersaccountstats.PlayersAccountStatsResponse;
import pt.api.report.playersaccountstats.PlayersAccountStatsResult;
import pt.api.report.playerstats.PlayerStats;
import pt.api.report.playerstats.PlayerStatsRequest;
import pt.api.report.playerstats.PlayerStatsResponse;
import pt.api.report.playerstats.PlayerStatsResult;
import pt.api.report.playertransactions.PlayerTransactions;
import pt.api.report.playertransactions.PlayerTransactionsRequest;
import pt.api.report.playertransactions.PlayerTransactionsResponse;
import pt.api.report.playertransactions.PlayerTransactionsResult;
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
//			playerDeposit();
//			playerInfo();
//			isPlayerOnline();
//			playerList();
//			logoutPlayer();
//			resetFailedLogin();
//			update();
//			withdraw();
			
//			masscreate();
//			massdeposit();
//			massfreeze();
//			masslogout();
//			masswithdraw();
//			massupdate();
			
//    		generateKey();
			
    		/****** REPORTS ******/
//			gamestats();
//			playergames();
//			playergamescount();
//			playerstats();
//			playeraccountstats();
//			playertransactions();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public static void playerBalance() throws Exception{
    	ConnectionProperties props = new ConnectionProperties("/home/peter/keystore.ImportKey", "5rNHoNTd");
    	String baseUrl="https://localhost/";
    	String entityKey="SDF80sdf";
    	
    	PlayerBalanceRequest request = new PlayerBalanceRequest();
    	request.setPlayername("");
    	
    	PlayerBalanceResponse response = PlayerBalance.call(baseUrl, request, entityKey, props);
    	
    	if(response.getErrorcode() == null){ //Success
    		System.out.println("Success");
    		PlayerBalanceResult result = response.getResult();
    		System.out.println(result);
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
    	ConnectionProperties props = new ConnectionProperties("/home/peter/keystore.ImportKey", "5rNHoNTd");
    	String baseUrl="https://localhost/";
    	String entityKey="SDF80sdf";
    	
    	PlayerCheckTransactionRequest request = new PlayerCheckTransactionRequest();
    	request.setExternaltransactionid("");
    	
    	PlayerCheckTransactionResponse response = PlayerCheckTransaction.call(baseUrl, request, entityKey, props);
    	
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
    	String baseUrl="https://localhost:8443/";
    	String entityKey="SDF80sdf";
    	ConnectionProperties props = new ConnectionProperties("/Users/JavaDev004/client.jks", "changeit");
    	
    	PlayerCreateRequest request = new PlayerCreateRequest();
    	request.set_3RDPContainer(new _3RDPContainer());
    	request.setAddress("");
    	request.setAdminname("APIACEGAMING");
    	request.setBirthdate("");
    	request.setCity("2010-01-16");
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
    	request.setKioskname("APIACEGAMING");
    	request.setLanguagecode("");
    	request.setLastname("");
    	request.setNickname("");
    	request.setPassword("");
    	request.setPhone("");
    	request.setPlayername("player_test");
    	request.setSex(0);
    	request.setState("");
    	request.setTrackingid("ACEJPY");
    	request.setViplevel(1);
    	request.setZip("");
    	
    	PlayerCreateResponse response = PlayerCreate.call(baseUrl, request, entityKey, props);
    	
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
    	String baseUrl="https://localhost/";
    	String entityKey="SDF80sdf";
    	
    	PlayerDepositRequest request = new PlayerDepositRequest();
    	request.setPlayername("");
    	request.setAdminname("");
    	request.setExternaltranid("");
    	request.setAmount("");
    	
    	ConnectionProperties props = new ConnectionProperties("/home/peter/keystore.ImportKey", "5rNHoNTd");
    	PlayerDepositResponse response = PlayerDeposit.call(baseUrl, request, entityKey, props);
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
    	String baseUrl="https://localhost/";
    	String entityKey="SDF80sdf";
    	
    	PlayerInfoRequest request = new PlayerInfoRequest();
    	request.setPlayername("");
    	request.setWith3RDPData(1);
    	
    	ConnectionProperties props = new ConnectionProperties("/home/peter/keystore.ImportKey", "5rNHoNTd");
    	PlayerInfoResponse response = PlayerInfo.call(baseUrl, request, entityKey, props);
    
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
    	String baseUrl="https://localhost/";
    	String entityKey="SDF80sdf";
    	
    	IsPlayerOnlineRequest request = new IsPlayerOnlineRequest();
    	request.setPlayername("");
    	
    	ConnectionProperties props = new ConnectionProperties("/home/peter/keystore.ImportKey", "5rNHoNTd");
    	IsPlayerOnlineResponse response = IsPlayerOnline.call(baseUrl, request, entityKey, props);
    	
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
    	String baseUrl="https://localhost/";
    	String entityKey="SDF80sdf";
    	PlayerListRequest request = new PlayerListRequest();
    	request.setAdminname("");
    	request.setKioskname("");
    	request.setOnline(false);
    	request.setPage(0);
    	request.setPerPage(0);
    	
    	ConnectionProperties props = new ConnectionProperties("/home/peter/keystore.ImportKey", "5rNHoNTd");
    	PlayerListResponse response = PlayerList.call(baseUrl, request, entityKey, props);

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
    	String baseUrl="https://localhost/";
    	String entityKey="SDF80sdf";
    	LogoutPlayerRequest request = new LogoutPlayerRequest();
    	request.setPlayername("");
    	
    	ConnectionProperties props = new ConnectionProperties("/home/peter/keystore.ImportKey", "5rNHoNTd");
    	LogoutPlayerResponse response = LogoutPlayer.call(baseUrl, request, entityKey, props);
    	
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
    	String baseUrl="https://localhost/";
    	String entityKey="SDF80sdf";
    	PlayerResetFailedLoginRequest request = new PlayerResetFailedLoginRequest();
    	request.setPlayername("ZTestTer");
    	
    	ConnectionProperties props = new ConnectionProperties("/home/peter/keystore.ImportKey", "5rNHoNTd");
    	PlayerResetFailedLoginResponse response = PlayerResetFailedLogin.call(baseUrl, request, entityKey, props);
    	
    	if(response.getErrorcode() == null){ //Success
    		System.out.println("Success");
    		PlayerResetFailedLoginResult res = response.getResult();
    		System.out.println(res);
    		if(res != null)
    			res.getResult();
    	}else{ //Error
    		System.out.println("Error");
    		response.getError();
    		response.getErrorcode();
    	}
    }
    
    public static void update() throws Exception{
    	String baseUrl="https://localhost/";
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
    	
    	ConnectionProperties props = new ConnectionProperties("/home/peter/keystore.ImportKey", "5rNHoNTd");
    	PlayerUpdateResponse response = PlayerUpdate.call(baseUrl, request, entityKey, props);
    	
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
    	String baseUrl="https://localhost/";
    	String entityKey="SDF80sdf";
    	PlayerWithdrawRequest request = new PlayerWithdrawRequest();
    	request.setAdminname("");
    	request.setAmount(BigDecimal.ZERO);
    	request.setExternaltranid("");
    	request.setIsForce("");
    	request.setLosebonus(false);
    	request.setPlayername("");
    	
    	ConnectionProperties props = new ConnectionProperties("/home/peter/keystore.ImportKey", "5rNHoNTd");
    	PlayerWithdrawResponse response = PlayerWithdraw.call(baseUrl, request, entityKey, props);
    	
    	if(response.getErrorcode() == null){ //Success
    		System.out.println("Success");
    		PlayerWithdrawResult res = response.getResult();
    		if(res != null){
    			System.out.println(res);
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
    
    public static void masscreate() throws Exception{
    	String baseUrl="https://localhost/";
    	String entityKey="SDF80sdf";
    	PlayerMassCreateRequest request = new PlayerMassCreateRequest();
    	request.setDepositowner("");
    	
    	List<PlayerMassCreateParam> params = new ArrayList<PlayerMassCreateParam>();
    	PlayerMassCreateParam param = new PlayerMassCreateParam();
    	_3RDPContainer rdpContainer = new _3RDPContainer();
    	rdpContainer.setCustom01("Custom Field");
    	param.set_3RDPContainer(rdpContainer);
    	param.setAddress("");
    	param.setAdminname("bez1");
    	param.setBirthdate("yyyy-MM-dd");
    	param.setCity("");
    	param.setComments("");
    	param.setCountrycode("");
    	param.setDeposit(10);
    	param.setEmail("");
    	param.setFax("");
    	param.setFirstname("");
    	param.setKioskname("bez_kiosk1");
    	param.setLanguagecode("");
    	param.setLastname("");
    	param.setPassword("");
    	param.setPhone("");
    	param.setPlayername("BEZ_PL_TEST13");
    	param.setSex(null);
    	param.setTrackingid("");
    	param.setViplevel(null);
    	param.setZip("");
    	
    	params.add(param);
    	
    	request.setParams(params);
    	
    	ConnectionProperties props = new ConnectionProperties("/home/peter/keystore.ImportKey", "5rNHoNTd");
    	PlayerMassCreateResponse response = PlayerMassCreate.call(baseUrl, request, entityKey, props);

    	if(response.getErrorcode() == null){ //Success
    		System.out.println("Success");
    		List<PlayerMassCreateResult> results = response.getResult();
    		for(PlayerMassCreateResult res : results){
    			System.out.println(res);
    			res.getPlayername();
    			PlayerMassCreateCreate create = res.getCreate();
    			if(create != null){
    				create.getError();
    				create.getErrorcode();
    				create.getPassword();
    				create.getResult();
    			}
    			PlayerMassCreateDeposit deposit = res.getDeposit();
    			if(deposit != null){
    				deposit.getAmount();
    				deposit.getCurrentplayerbalance();
    				deposit.getError();
    				deposit.getErrorcode();
    				deposit.getExecutiontime();
    				deposit.getInstantcashtype();
    				deposit.getKiosktransactiontime();
    				deposit.getPtinternaltransactionid();
    				deposit.getResult();
    			}
    		}
        	
    	}else{ //Error
    		System.out.println("Error");
    		response.getError();
    		response.getErrorcode();
    	}
    }
    
    public static void massfreeze() throws Exception{
    	String baseUrl="https://localhost/";
    	String entityKey="SDF80sdf";
    	PlayerMassFreezeRequest request = new PlayerMassFreezeRequest();
    	request.setDepositowner("bez1");
    	request.setIsFreeze("1");
    	request.setIsWithdraw("1");
    	
    	
    	List<PlayerMassFreezeParam> params = new ArrayList<PlayerMassFreezeParam>();
    	PlayerMassFreezeParam param = new PlayerMassFreezeParam();
    	param.setPlayername("BEZ_PL_TEST3");
    	params.add(param);
    	
    	request.setParams(params);
    	
    	ConnectionProperties props = new ConnectionProperties("/home/peter/keystore.ImportKey", "5rNHoNTd");
    	PlayerMassFreezeResponse response = PlayerMassFreeze.call(baseUrl, request, entityKey, props);
    	
    	if(response.getErrorcode() == null){ //Success
    		System.out.println("Success");
    		List<PlayerMassFreezeResult> results = response.getResult();
    		for(PlayerMassFreezeResult res : results){
    			System.out.println(res);
    			res.getPlayername();
    			PlayerMassFreezeFreeze freeze = res.getFreeze();
    			if(freeze != null){
    				freeze.getError();
    				freeze.getResult();
        		}
    			
    			PlayerMassFreezeWithdraw withdraw = res.getWithdraw();
    			if(withdraw != null){
    				withdraw.getAmount();
    				withdraw.getCurrentplayerbalance();
    				withdraw.getError();
    				withdraw.getErrorcode();
    				withdraw.getExecutiontime();
    				withdraw.getInstantcashtype();
    				withdraw.getKiosktransactionid();
    				withdraw.getKiosktransactiontime();
    				withdraw.getPtinternaltransactionid();
    				withdraw.getResult();
        		}
    		}
    	}else{ //Error
    		System.out.println("Error");
    		response.getError();
    		response.getErrorcode();
    	}
    }
    
    public static void massdeposit() throws Exception{
    	String baseUrl="https://localhost/";
    	String entityKey="SDF80sdf";
    	PlayerMassDepositRequest request = new PlayerMassDepositRequest();
    	request.setDepositowner("bez1");
    	
    	List<PlayerMassDepositParam> params = new ArrayList<PlayerMassDepositParam>();
    	PlayerMassDepositParam param = new PlayerMassDepositParam();
    	param.setAmount(new BigDecimal(10));
    	param.setPlayername("player01");
    	params.add(param);
    	
    	request.setParams(params);
    	
    	ConnectionProperties props = new ConnectionProperties("/home/peter/keystore.ImportKey", "5rNHoNTd");
    	PlayerMassDepositResponse response = PlayerMassDeposit.call(baseUrl, request, entityKey, props);
    	
    	if(response.getErrorcode() == null){ //Success
    		System.out.println("Success");
    		List<PlayerMassDepositResult> results = response.getResult();
    		for(PlayerMassDepositResult res : results){
    			System.out.println(res);
    			res.getPlayername();
    			PlayerMassDepositDeposit deposit = res.getDeposit();
    			if(deposit != null){
    				deposit.getAmount();
    				deposit.getCurrentplayerbalance();
    				deposit.getError();
    				deposit.getErrorcode();
    				deposit.getExecutiontime();
    				deposit.getInstantcashtype();
    				deposit.getKiosktransactiontime();
    				deposit.getPtinternaltransactionid();
    				deposit.getResult();
        		}
    		}
    	}else{ //Error
    		System.out.println("Error");
    		response.getError();
    		response.getErrorcode();
    	}
    }
    
    public static void masslogout() throws Exception{
    	String baseUrl="https://localhost/";
    	String entityKey="SDF80sdf";
    	PlayerMassLogoutRequest request = new PlayerMassLogoutRequest();
    	
    	List<PlayerMassLogoutParam> params = new ArrayList<PlayerMassLogoutParam>();
    	PlayerMassLogoutParam param = new PlayerMassLogoutParam();
    	param.setPlayername("BEZ_PLAYER1");
    	params.add(param);
    	
    	param= new PlayerMassLogoutParam();
    	param.setPlayername("BEZ_PLAYER2");
    	params.add(param);
    	
    	request.setParams(params);
    	ConnectionProperties props = new ConnectionProperties("/home/peter/keystore.ImportKey", "5rNHoNTd");
    	PlayerMassLogoutResponse response = PlayerMassLogout.call(baseUrl, request, entityKey, props);
    	if(response.getErrorcode() == null){ //Success
    		System.out.println("Success");
    		List<PlayerMassLogoutResult> results = response.getResult();
    		for(PlayerMassLogoutResult res : results){
    			System.out.println(res);
    			res.getPlayername();
    			PlayerMassLogoutLogout logout = res.getLogout();
    			if(logout != null){
    				logout.getError();
    				logout.getErrorcode();
    				logout.getResult();
        		}
    		}
    	}else{ //Error
    		System.out.println("Error");
    		response.getError();
    		response.getErrorcode();
    	}
    }
    
    public static void masswithdraw() throws Exception{
    	String baseUrl="https://localhost/";
    	String entityKey="SDF80sdf";
    	PlayerMassWithdrawRequest request = new PlayerMassWithdrawRequest();
    	request.setDepositowner("bez1");
    	
    	List<PlayerMassWithdrawParam> params = new ArrayList<PlayerMassWithdrawParam>();
    	PlayerMassWithdrawParam param = new PlayerMassWithdrawParam();
    	param.setPlayername("player01");
    	param.setAmount(new BigDecimal(10));
    	params.add(param);
    	
    	request.setParams(params);
    	ConnectionProperties props = new ConnectionProperties("/home/peter/keystore.ImportKey", "5rNHoNTd");
    	PlayerMassWithdrawResponse response = PlayerMassWithdraw.call(baseUrl, request, entityKey, props);
    	
    	if(response.getErrorcode() == null){ //Success
    		System.out.println("Success");
    		List<PlayerMassWithdrawResult> results = response.getResult();
    		for(PlayerMassWithdrawResult res : results){
    			res.getPlayername();
    			System.out.println(res);
    			PlayerMassWithdrawWithdraw withdraw = res.getWithdraw();
    			if(withdraw != null){
    				withdraw.getAmount();
    				withdraw.getCurrentplayerbalance();
    				withdraw.getError();
    				withdraw.getErrorcode();
    				withdraw.getExecutiontime();
    				withdraw.getInstantcashtype();
    				withdraw.getKiosktransactionid();
    				withdraw.getKiosktransactiontime();
    				withdraw.getPtinternaltransactionid();
    				withdraw.getResult();
        		}
    		}
    	}else{ //Error
    		System.out.println("Error");
    		response.getError();
    		response.getErrorcode();
    	}
    }
    
    public static void massupdate() throws Exception{
    	String baseUrl="https://localhost:8443/";
    	String entityKey="SDF80sdf";
    	PlayerMassUpdateRequest request = new PlayerMassUpdateRequest();

    	List<PlayerMassUpdateParam> params = new ArrayList<PlayerMassUpdateParam>();
    	PlayerMassUpdateParam param = new PlayerMassUpdateParam();
    	_3RDPContainer rdpContainer = new _3RDPContainer();
    	rdpContainer.setCustom01("Custom Field");
    	param.set_3RDPContainer(rdpContainer);
    	param.setAddress("");
    	param.setBirthdate("yyyy-MM-dd");
    	param.setCity("");
    	param.setComments("");
    	param.setCountrycode("");
    	param.setCustom02("");
    	param.setCustom03("");
    	param.setCustom04("");
    	param.setCustom05("");
    	param.setCustom06("");
    	param.setCustom07("");
    	param.setCustom08("");
    	param.setCustom09("");
    	param.setCustom10("");
    	param.setCustom11("");
    	param.setCustom12("");
    	param.setCustom13("");
    	param.setCustom14("");
    	param.setCustom15("");
    	param.setCustom16("");
    	param.setCustom17("");
    	param.setCustom18("");
    	param.setCustom19("");
    	param.setCustom20("");
    	param.setEmail("");
    	param.setFax("");
    	param.setFirstname("aaa");
    	param.setFrozen(null);
    	param.setLanguagecode("");
    	param.setLastname("");
    	param.setPassword("");
    	param.setPhone("");
    	param.setPlayername("player01");
    	param.setSex(null);
    	param.setState("");
    	param.setTrackingid("");
    	param.setViplevel(null);
    	param.setZip("");
    	
    	params.add(param);
    	
    	request.setParams(params);
    	
    	ConnectionProperties props = new ConnectionProperties("/Users/JavaDev004/client.jks", "changeit");
    	PlayerMassUpdateResponse response = PlayerMassUpdate.call(baseUrl, request, entityKey, props);
    	
    	if(response.getErrorcode() == null){ //Success
    		System.out.println("Success");
    		List<PlayerMassUpdateResult> results = response.getResult();
    		for(PlayerMassUpdateResult res : results){
    			System.out.println(res);
    			res.getPlayername();
    			PlayerMassUpdateUpdate update = res.getUpdate();
    			if(update != null){
    				update.getErrorcode();
    				update.getError();
    				update.getResult();
    			}
    		}
    	}else{ //Error
    		System.out.println("Error");
    		response.getError();
    		response.getErrorcode();
    	}
    }
    
    public static void generateKey() throws Exception{
    	String baseUrl="https://localhost/";
    	
    	GenerateKeyRequest request = new GenerateKeyRequest();
    	request.setEntityname("eurotest");
    	
    	ConnectionProperties props = new ConnectionProperties("/home/peter/keystore.ImportKey", "5rNHoNTd");
    	GenerateKeyResponse response = GenerateKey.call(baseUrl, request, props);
    	
    	if(response.getErrorcode() == null){ //Success
    		System.out.println("Success");
    		GenerateKeyResult result = response.getResult();
    		System.out.println(result);
        	if(result != null){
        		result.getKey();
        	}
    	}else{ //Error 
    		System.out.println("Error");
    		response.getError();
    		response.getErrorcode();
    	}
    	
    }
    
    public static void gamestats() throws Exception{
    	String baseUrl="https://localhost:8443/";
    	String entityKey="SDF80sdf";
    	
    	GameStatsRequest request = new GameStatsRequest();
    	request.setStartdate("2015-03-01"); //mandatory if timeperiod = specify
    	request.setEnddate("2015-03-30");	//mandatory if timeperiod = specify
    	request.setGametype("regular");
    	request.setReportby("game");
    	request.setSortby("games");
    	request.setTimeperiod("specify");
    	request.setPlayername("");
    	request.setViplevel("");
    	request.setGametypesearch("");
    	request.setGamename("");
    	request.setGamecode("");
    	request.setKioskname("");
    	request.setMinbet("");
    	request.setMaxbet("");
    	request.setLivenetwork("");
    	request.setMinwin("");
    	request.setMaxwin("");
    	request.setClientplatform("");
    	request.setShowjackpot("");
    	request.setShowrealmoney("");
    	request.setShowlivegamestip("");
    	request.setSortorder(0);
    	request.setIncludehourdata("");
    	request.setCurrency("");
    	request.setPage(1);
    	request.setPerPage(50);
    	
    	ConnectionProperties props = new ConnectionProperties("/home/peter/keystore.ImportKey", "5rNHoNTd");
    	GameStatsResponse response = GameStats.call(baseUrl, request, entityKey, props);
    	System.out.println(response);
    	String error = (String) response.getError();
    	System.out.println(error.toString());
    	if(response.getErrorcode() == null){ //Success
    		System.out.println("Success");
    		List<GameStatsResult> results = response.getResult();
    		Pagination pagination = response.getPagination();
    		pagination.getCurrentPage();
    		pagination.getItemsPerPage();
    		pagination.getTotalCount();
    		pagination.getTotalPages();
    		
    		for(GameStatsResult result : results){
    			System.out.println(result);
            	if(result != null){
            		
            		result.getBETS();
            		result.getCLIENTPLATFORM();
            		result.getCOUNTRY();
            		result.getCURRENCYCODE();
            		result.getDAILY();
            		result.getFULLNAME();
            		result.getGAME();
            		result.getGAMES();
            		result.getGAMETYPE();
            		result.getINCOME();
            		result.getJACKPOTWINS();
            		result.getJACKPOTBETS();
            		result.getKIOSKNAME();
            		result.getPLAYERNAME();
            		result.getPLAYERS();
            		result.getREALMONEYBETS();
            		result.getREALMONEYWINS();
            		result.getTOTALLIVEGAMETIPS();
            		result.getVIP_LEVEL();
            		result.getVIPLEVEL();
            		result.getWINS();
            		
            		result.getRNUM();
            	}
    		}
    		
    	}else{ //Error 
    		System.out.println("Error");
    		response.getError();
    		response.getErrorcode();
    	}
    }
    
    public static void playergames() throws Exception{
    	String baseUrl="https://localhost:8443/";
    	String entityKey="SDF80sdf";
    	
    	PlayerGamesRequest request = new PlayerGamesRequest();
    	request.setStartdate("2015-03-01"); //mandatory if timeperiod = specify
    	request.setEnddate("2015-03-30");	//mandatory if timeperiod = specify
    	request.setGametype("regular");
    	request.setSortby("games");
    	request.setTimeperiod("specify");
    	request.setPlayername("");
    	request.setSortorder(0);
    	request.setPage(1);
    	request.setPerPage(50);
    	request.setShowinfo("");
    	
    	ConnectionProperties props = new ConnectionProperties("/home/peter/keystore.ImportKey", "5rNHoNTd");
    	PlayerGamesResponse response = PlayerGames.call(baseUrl, request, entityKey, props);
    	
    	if(response.getErrorcode() == null){ //Success
    		System.out.println("Success");
    		List<PlayerGamesResult> results = response.getResult();
    		Pagination pagination = response.getPagination();
    		pagination.getCurrentPage();
    		pagination.getItemsPerPage();
    		pagination.getTotalCount();
    		pagination.getTotalPages();
    		
    		for(PlayerGamesResult result : results){
    			System.out.println(result);
            	if(result != null){
            		result.getBALANCE();
            		result.getBET();
            		result.getCURRENTBET();
            		result.getGAMECODE();
            		result.getGAMEDATE();
            		result.getGAMEID();
            		result.getGAMENAME();
            		result.getGAMETYPE();
            		result.getINFO();
            		result.getLIVENETWORK();
            		result.getPLAYERNAME();
            		result.getPROGRESSIVEBET();
            		result.getPROGRESSIVEWIN();
            		result.getSESSIONID();
            		result.getWIN();
            		result.getWINDOWCODE();
            		result.getRNUM();
            	}
    		}
    		
    	}else{ //Error 
    		System.out.println("Error");
    		response.getError();
    		response.getErrorcode();
    	}
    }
    
    public static void playergamescount() throws Exception{
    	String baseUrl="https://localhost:8443/";
    	String entityKey="SDF80sdf";
    	
    	PlayerGamesCountRequest request = new PlayerGamesCountRequest();
    	request.setSortby("games");
    	request.setPlayername("");
    	request.setSortorder(0);
    	request.setPage(1);
    	request.setPerPage(50);
    	request.setLastgamescount(12);
    	
    	ConnectionProperties props = new ConnectionProperties("/home/peter/keystore.ImportKey", "5rNHoNTd");
    	PlayerGamesCountResponse response = PlayerGamesCount.call(baseUrl, request, entityKey, props);
    	
    	if(response.getErrorcode() == null){ //Success
    		System.out.println("Success");
    		List<PlayerGamesCountResult> results = response.getResult();
    		Pagination pagination = response.getPagination();
    		pagination.getCurrentPage();
    		pagination.getItemsPerPage();
    		pagination.getTotalCount();
    		pagination.getTotalPages();
    		
    		for(PlayerGamesCountResult result : results){
    			System.out.println(result);
            	if(result != null){
            		result.getASPROGRESSIVEWIN();
            		result.getBALANCE();
            		result.getBET();
            		result.getCURRENTBET();
            		result.getGAMECODE();
            		result.getGAMEDATE();
            		result.getGAMEID();
            		result.getGAMENAME();
            		result.getINFO();
            		result.getLIVENETWORK();
            		result.getPLAYERNAME();
            		result.getPROGRESSIVEBET();
            		result.getSESSIONID();
            		result.getWIN();
            		result.getRNUM();
            	}
    		}
    		
    	}else{ //Error 
    		System.out.println("Error");
    		response.getError();
    		response.getErrorcode();
    	}
    }
    
    public static void playeraccountstats() throws Exception{
    	String baseUrl="https://localhost:8443/";
    	String entityKey="SDF80sdf";
    	
    	PlayersAccountStatsRequest request = new PlayersAccountStatsRequest();
    	request.setStartdate("2015-03-01"); //mandatory if timeperiod = specify
    	request.setEnddate("2015-03-30");	//mandatory if timeperiod = specify
    	request.setEntityname("");
    	request.setGroupby("");
    	request.setKioskname("");
    	request.setTimeperiod("specify");
    	request.setPlayername("");
    	request.setPage(1);
    	request.setPerPage(50);
    	
    	ConnectionProperties props = new ConnectionProperties("/home/peter/keystore.ImportKey", "5rNHoNTd");
    	PlayersAccountStatsResponse response = PlayersAccountStats.call(baseUrl, request, entityKey, props);
    	
    	if(response.getErrorcode() == null){ //Success
    		System.out.println("Success");
    		List<PlayersAccountStatsResult> results = response.getResult();
    		Pagination pagination = response.getPagination();
    		pagination.getCurrentPage();
    		pagination.getItemsPerPage();
    		pagination.getTotalCount();
    		pagination.getTotalPages();
    		
    		for(PlayersAccountStatsResult result : results){
    			System.out.println(result);
            	if(result != null){
            		result.getPLAYERNAME();
            		result.getBALANCECHANGE();
            		result.getBGDEPOSITS();
            		result.getBGWITHDRAWS();
            		result.getCHARGEBACKREVERSES();
            		result.getCHARGEBACKS();
            		result.getCPBALANCE();
            		result.getCREDITREVERSES();
            		result.getCREDITS();
            		result.getCURRENCYCODE();
            		result.getDEPOSITCORRECTIONS();
            		result.getDEPOSITS();
            		result.getENTITYNAME();
            		result.getGAMEPAYMENTSDEPOSITS();
            		result.getGAMEPAYMENTSWITHDRAWS();
            		result.getKIOSKNAME();
            		result.getNETREVENUE();
            		result.getOPBALANCE();
            		result.getPENDINGBALANCECHANGE();
            		result.getPGDEPOSITS();
            		result.getPGWITHDRAWS();
            		result.getPLAYERPAIDWITHDRAWFEE();
            		result.getPLAYERTRANSFERDEPOSITS();
            		result.getPLAYERTRANSFERWITHDRAWS();
            		result.getPOKERWONTOKENREVERSES();
            		result.getPOKERWONTOKENS();
            		result.getPROGRESSIVEREFUNDS();
            		result.getRETURNREVERSES();
            		result.getRETURNS();
            		result.getSPORTSBOOK();
            		result.getTLEDEPOSITBALANCE();
            		result.getTRANSFERS();
            		result.getWITHDRAWCORRECTIONS();
            		result.getWITHDRAWS();
            		result.getRNUM();
            	}
    		}
    		
    	}else{ //Error 
    		System.out.println("Error");
    		response.getError();
    		response.getErrorcode();
    	}
    }
    
    public static void playerstats() throws Exception{
    	String baseUrl="https://localhost:8443/";
    	String entityKey="SDF80sdf";
    	
    	PlayerStatsRequest request = new PlayerStatsRequest();
    	request.setStartdate("2015-03-01"); //mandatory if timeperiod = specify
    	request.setEnddate("2015-03-30");	//mandatory if timeperiod = specify
    	request.setAdminname("");
    	request.setCurrency("");
    	request.setCustomfieldname("");
    	request.setCustomfieldvalue("");
    	request.setIncludehourdata("");
    	request.setEntityname("");
    	request.setKioskname("");
    	request.setTimeperiod("specify");
    	request.setPlayername("");
    	request.setPlatform("");
    	request.setReportby("");
    	request.setReportbycustomfield("");
    	request.setPage(1);
    	request.setPerPage(50);
    	
    	ConnectionProperties props = new ConnectionProperties("/home/peter/keystore.ImportKey", "5rNHoNTd");
    	PlayerStatsResponse response = PlayerStats.call(baseUrl, request, entityKey, props);
    	
    	if(response.getErrorcode() == null){ //Success
    		System.out.println("Success");
    		List<PlayerStatsResult> results = response.getResult();
    		Pagination pagination = response.getPagination();
    		pagination.getCurrentPage();
    		pagination.getItemsPerPage();
    		pagination.getTotalCount();
    		pagination.getTotalPages();
    		
    		for(PlayerStatsResult result : results){
    			System.out.println(result);
            	if(result != null){
            		result.getACTIVEPLAYERS();
            		result.getBALANCECHANGE();
            		result.getBETS();
            		result.getBONUSES();
            		result.getCLIENTPLATFORM();
            		result.getCODE();
            		result.getCOMPENSATION();
            		result.getCOMPS();
            		result.getCURRENCYCODE();
            		result.getDEPOSITS();
            		result.getENTITYCODE();
            		result.getENTITYNAME();
            		result.getHOUSEEARNINGS();
            		result.getKIOSKNAME();
            		result.getNETGAMING();
            		result.getNETLOSS();
            		result.getNETPURCHASE();
            		result.getPLAYERNAME();
            		result.getPROGRESSIVEBETS();
            		result.getPROGRESSIVEWINS();
            		result.getSTATSDATE();
            		result.getWINS();
            		result.getWITHDRAWS();
            		result.getRNUM();
            	}
    		}
    		
    	}else{ //Error 
    		System.out.println("Error");
    		response.getError();
    		response.getErrorcode();
    	}
    }
    
    public static void playertransactions() throws Exception{
    	String baseUrl="https://localhost:8443/";
    	String entityKey="SDF80sdf";
    	
    	PlayerTransactionsRequest request = new PlayerTransactionsRequest();
    	request.setStartdate("2015-03-01"); //mandatory if timeperiod = specify
    	request.setEnddate("2015-03-30");	//mandatory if timeperiod = specify
    	request.setSortby("");
    	request.setSortorder(0);
    	request.setPage(1);
    	request.setPerPage(50);
    	
    	ConnectionProperties props = new ConnectionProperties("/home/peter/keystore.ImportKey", "5rNHoNTd");
    	PlayerTransactionsResponse response = PlayerTransactions.call(baseUrl, request, entityKey, props);
    	
    	if(response.getErrorcode() == null){ //Success
    		System.out.println("Success");
    		List<PlayerTransactionsResult> results = response.getResult();
    		Pagination pagination = response.getPagination();
    		pagination.getCurrentPage();
    		pagination.getItemsPerPage();
    		pagination.getTotalCount();
    		pagination.getTotalPages();
    		
    		for(PlayerTransactionsResult result : results){
    			System.out.println(result);
            	if(result != null){
            		result.getADMINNAME();
            		result.getAMOUNT();
            		result.getBRAND();
            		result.getKIOSKNAME();
            		result.getPLAYERNAME();
            		result.getREMOTEIP();
            		result.getTRANSACTIONTIME();
            		result.getTYPE();
            		result.getRNUM();
            	}
    		}
    		
    	}else{ //Error 
    		System.out.println("Error");
    		response.getError();
    		response.getErrorcode();
    	}
    }
}
