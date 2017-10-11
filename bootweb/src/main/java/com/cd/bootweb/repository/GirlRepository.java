package com.cd.bootweb.repository;

import com.cd.bootweb.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRepository extends JpaRepository<Girl,Integer> {

    //jpa的方法名一定要规范
    public List<Girl> findByAge(Integer age);

}
