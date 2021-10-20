package com.web3j.test;

import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.web3j.protocol.Web3j;
import org.web3j.protocol.admin.Admin;
import org.web3j.protocol.admin.methods.response.PersonalListAccounts;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.methods.response.EthGetBalance;
import org.web3j.protocol.http.HttpService;

import com.bnx.util.HttpUtil;
import com.web3j.util.Environment;


public class Test {
	private static Web3j web3j;
	public static void main(String[] args) throws Exception {
		web3j = Web3j.build(new HttpService(Environment.RPC_URL));
		getBalance("0x1E71950Bc447075d062Df4e206172C38df0BF7D5");
	/*	HashMap<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("Page", "1");
		hashMap.put("GoldAddress", "0x25108Df0D2C33a803EdBF9f27f38A270F3f8a00f");
		hashMap.put("Limit", "10000");
		String post = HttpUtil.sendPostUrl("https://game.binaryx.pro//v1/dungeon/loglist", "Page=1&Limit=10000&GoldAddress=0x25108Df0D2C33a803EdBF9f27f38A270F3f8a00f","utf-8");
		System.out.println(post);*/
	}
	
	/**
	 * 获取余额gas
	 *
	 * @param address 钱包地址
	 * @return 余额
	 */
	private static BigInteger getBalance(String address) {
		BigInteger balance = null;
		try {
			EthGetBalance ethGetBalance = web3j.ethGetBalance(address, DefaultBlockParameterName.LATEST).send();
			balance = ethGetBalance.getBalance();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("address " + address + " balance " + balance + " wei");
		return balance;
	}
}
