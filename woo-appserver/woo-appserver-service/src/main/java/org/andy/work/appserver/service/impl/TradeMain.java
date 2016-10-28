package org.andy.work.appserver.service.impl;

import javax.annotation.Resource;

import org.andy.work.appserver.dao.IDetailmessageDAO;
import org.andy.work.appserver.dao.ITradeDAO;
import org.andy.work.appserver.model.ITrade;
import org.andy.work.appserver.model.impl.Trade;
import org.andy.work.appserver.service.ITradeMain;
import org.andy.work.criteria.AcctUserSearchCriteria;
import org.andy.work.paging.SearchRequest;
import org.andy.work.paging.SearchResponse;
import org.springframework.stereotype.Service;

@Service
public class TradeMain  implements ITradeMain {
 
	@Resource
	private ITradeDAO trade;
	
	@Override
	public SearchResponse<ITrade> searchborrow(SearchRequest<AcctUserSearchCriteria> searchReq,Integer userid){
		return this.trade.searchborrow(searchReq, userid);
	}
	
	@Override
	public SearchResponse<ITrade> searchborrow1(SearchRequest<AcctUserSearchCriteria> searchReq,Integer userid){
		return this.trade.searchborrow1(searchReq, userid);
	}
	
	@Override
	public SearchResponse<ITrade> searchseller(SearchRequest<AcctUserSearchCriteria> searchReq,Integer userid){
		return this.trade.searchseller(searchReq, userid);
	}
	
	@Override
	public SearchResponse<ITrade> searchseller1(SearchRequest<AcctUserSearchCriteria> searchReq,Integer userid){
		return this.trade.searchseller1(searchReq, userid);
	}
	
	@Override
	public SearchResponse<ITrade> searchsuccess(SearchRequest<AcctUserSearchCriteria> searchReq,Integer userid){
		return this.trade.searchsuccess(searchReq, userid);
	}
	
	
	@Override
	public SearchResponse<ITrade> searchsuccessSeller(SearchRequest<AcctUserSearchCriteria> searchReq,Integer userid){
		return this.trade.searchsuccessSeller(searchReq, userid);
	}
	
	@Override
	public SearchResponse<ITrade> searchsuccess1(SearchRequest<AcctUserSearchCriteria> searchReq,Integer userid){
		return this.trade.searchsuccess1(searchReq, userid);
	}
	
	
	@Override
	public SearchResponse<ITrade> searchsuccessSeller1(SearchRequest<AcctUserSearchCriteria> searchReq,Integer userid){
		return this.trade.searchsuccessSeller1(searchReq, userid);
	}
	
	
	@Override
	public Trade searchmyself1(Integer userid,Integer thingid){
		return this.trade.searchmyself1(userid,thingid);
	}
	
	@Override
	public Trade searchmyself2(Integer userid,Integer thingid){
		return this.trade.searchmyself2(userid,thingid);
	}
	
	@Override
	public  String updatemessage(Trade trade){
		String judge=this.trade.updatemessage(trade);
		return judge; 
	 }

	@Override
	public String addmessage(Trade trade){
		String judge=this.trade.addmessage(trade);
		return judge; 
	}
	
	@Override
	public Trade getTrade(Integer tradeid){
		Trade trade=this.trade.getTrade(tradeid);
		return trade;
	}
	
}
