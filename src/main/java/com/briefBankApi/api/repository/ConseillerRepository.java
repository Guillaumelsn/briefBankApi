package com.briefBankApi.api.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.briefBankApi.api.model.Conseiller;

@Repository
public interface ConseillerRepository extends CrudRepository<Conseiller, Long> {
}
