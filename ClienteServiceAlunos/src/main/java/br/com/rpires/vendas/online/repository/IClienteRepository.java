package br.com.rpires.vendas.online.repository;

import br.com.rpires.vendas.online.domain.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IClienteRepository extends MongoRepository<Cliente, String> {
    Optional<Cliente> findByCpf(Long cpf);
}