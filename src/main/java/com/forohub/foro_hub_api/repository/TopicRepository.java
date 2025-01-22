package com.forohub.foro_hub_api.repository;

import com.forohub.foro_hub_api.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
