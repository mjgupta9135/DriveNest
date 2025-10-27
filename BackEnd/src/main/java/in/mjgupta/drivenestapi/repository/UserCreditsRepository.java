package in.mjgupta.drivenestapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.mjgupta.drivenestapi.document.UserCredits;

import java.util.Optional;

public interface UserCreditsRepository extends MongoRepository<UserCredits, String> {

    Optional<UserCredits> findByClerkId(String clerkId);
}
