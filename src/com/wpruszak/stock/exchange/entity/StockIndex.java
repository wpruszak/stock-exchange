package com.wpruszak.stock.exchange.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(indexes = { 
		@Index(columnList = "ticker", name = "idx_ticker"),
		@Index(columnList = "name", name = "idx_name")
})
public class StockIndex {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private String ticker;

	@Column(precision = 10, scale = 2)
	private Double exchange;

	@Column(precision = 10, scale = 2)
	private Double percentChange;

	@Column(precision = 10, scale = 2)
	private Double escChange;

	@Column(precision = 10, scale = 2)
	private Double referenceRate;

	@Column(precision = 10, scale = 2)
	private Double openingRate;

	@Column(precision = 10, scale = 2)
	private Double max1D;

	@Column(precision = 10, scale = 2)
	private Double min1D;

	private Long tradingVolume;

	private Long tradingValue;

	private Long transactionCount;

	@Column(precision = 10, scale = 2)
	private Double returnRatePercent;

	@Column(precision = 10, scale = 2)
	private Double max1R;

	private LocalDate max1Rdate;

	@Column(precision = 10, scale = 2)
	private Double min1R;

	private LocalDate min1Rdate;
	
	private LocalDateTime date;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public Double getExchange() {
		return exchange;
	}

	public void setExchange(Double exchange) {
		this.exchange = exchange;
	}

	public Double getPercentChange() {
		return percentChange;
	}

	public void setPercentChange(Double percentChange) {
		this.percentChange = percentChange;
	}

	public Double getEscChange() {
		return escChange;
	}

	public void setEscChange(Double escChange) {
		this.escChange = escChange;
	}

	public Double getReferenceRate() {
		return referenceRate;
	}

	public void setReferenceRate(Double referenceRate) {
		this.referenceRate = referenceRate;
	}

	public Double getOpeningRate() {
		return openingRate;
	}

	public void setOpeningRate(Double openingRate) {
		this.openingRate = openingRate;
	}

	public Double getMax1D() {
		return max1D;
	}

	public void setMax1D(Double max1d) {
		max1D = max1d;
	}

	public Double getMin1D() {
		return min1D;
	}

	public void setMin1D(Double min1d) {
		min1D = min1d;
	}

	public Long getTradingVolume() {
		return tradingVolume;
	}

	public void setTradingVolume(Long tradingVolume) {
		this.tradingVolume = tradingVolume;
	}

	public Long getTradingValue() {
		return tradingValue;
	}

	public void setTradingValue(Long tradingValue) {
		this.tradingValue = tradingValue;
	}

	public Long getTransactionCount() {
		return transactionCount;
	}

	public void setTransactionCount(Long transactionCount) {
		this.transactionCount = transactionCount;
	}

	public Double getReturnRatePercent() {
		return returnRatePercent;
	}

	public void setReturnRatePercent(Double returnRatePercent) {
		this.returnRatePercent = returnRatePercent;
	}

	public Double getMax1R() {
		return max1R;
	}

	public void setMax1R(Double max1r) {
		max1R = max1r;
	}

	public Double getMin1R() {
		return min1R;
	}

	public void setMin1R(Double min1r) {
		min1R = min1r;
	}

	public LocalDate getMax1Rdate() {
		return max1Rdate;
	}

	public void setMax1Rdate(LocalDate max1Rdate) {
		this.max1Rdate = max1Rdate;
	}

	public LocalDate getMin1Rdate() {
		return min1Rdate;
	}

	public void setMin1Rdate(LocalDate min1Rdate) {
		this.min1Rdate = min1Rdate;
	}
	
	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "StockIndex [id=" + id + ", name=" + name + ", ticker=" + ticker + ", exchange=" + exchange
				+ ", percentChange=" + percentChange + ", escChange=" + escChange + ", referenceRate=" + referenceRate
				+ ", openingRate=" + openingRate + ", max1D=" + max1D + ", min1D=" + min1D + ", tradingVolume="
				+ tradingVolume + ", tradingValue=" + tradingValue + ", transactionCount=" + transactionCount
				+ ", returnRatePercent=" + returnRatePercent + ", max1R=" + max1R + ", max1Rdate=" + max1Rdate
				+ ", min1R=" + min1R + ", min1Rdate=" + min1Rdate + ", date=" + date + "]";
	}
}
