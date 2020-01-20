package com.xinyao.london.data.repository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.xinyao.london.data.entity.Guest;

public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

}