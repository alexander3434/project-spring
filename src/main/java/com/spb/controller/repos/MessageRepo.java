package com.spb.controller.repos;

import com.spb.controller.domain.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepo extends CrudRepository<Message, Integer> {
}
//получаем полный список полей
