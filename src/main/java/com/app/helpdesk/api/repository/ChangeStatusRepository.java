package com.app.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.helpdesk.api.security.entity.ChangeStatus;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String> {

	Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatusDesc(String ticketId);
}
