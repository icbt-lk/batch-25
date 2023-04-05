/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package in.bushansirgur.onlinebookstore.repository;

/**
 *
 * @author Cool buddy
 */

import in.bushansirgur.onlinebookstore.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
    Optional<User> findOneByEmailAndPassword(String email, String password);
 
    User findByEmail(String email);
}


 

