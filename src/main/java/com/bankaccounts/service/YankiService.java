package com.bankaccounts.service;

import com.bankaccounts.dto.YankiRequestDto;
import com.bankaccounts.dto.YankiResponseDto;
import com.bankaccounts.model.Yanki;
import com.bankaccounts.dto.Message;

import com.bankaccounts.dto.TransferRequestDto1;
import com.bankaccounts.dto.TransferResponseDto1;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface YankiService {

	Flux<Yanki> getAll();

	Mono<Yanki> getYankiById(String yankiId);

	Mono<YankiResponseDto> createYankiPerson(YankiRequestDto yankiRequestDto);
	
	Mono<YankiResponseDto> createYankiCompany(YankiRequestDto yankiRequestDto);

	Mono<Yanki> updateYanki(YankiRequestDto yankiRequestDto);

	Mono<Message> deleteYanki(String yankiId);
	
	Mono<YankiResponseDto> depositYanki(YankiRequestDto yankiRequestDto);
	
	Mono<YankiResponseDto> withdrawalYanki(YankiRequestDto yankiRequestDto);
	
	Flux<Yanki> getAllYankiXCustomerId(String customerId);

	
	Mono<TransferResponseDto1> transferBetweenYanki(TransferRequestDto1 transferRequestDto1);
	
	Mono<TransferResponseDto1> transferThirdParty(TransferRequestDto1 transferRequestDto1);

}