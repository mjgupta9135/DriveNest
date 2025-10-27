package in.mjgupta.drivenestapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.mjgupta.drivenestapi.document.PaymentTransaction;

import java.util.List;

public interface PaymentTransactionRepository extends MongoRepository<PaymentTransaction, String> {

    List<PaymentTransaction> findByClerkId(String clerkId);

    List<PaymentTransaction> findByClerkIdOrderByTransactionDateDesc(String clerkId);

    List<PaymentTransaction> findByClerkIdAndStatusOrderByTransactionDateDesc(String clerkId, String status);
}
