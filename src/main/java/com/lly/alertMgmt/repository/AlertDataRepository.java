package com.lly.alertMgmt.repository;

import com.lly.alertMgmt.domain.AlertData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertDataRepository extends JpaRepository<AlertData, Long> {
    //
}
