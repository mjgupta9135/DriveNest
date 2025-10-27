package in.mjgupta.drivenestapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.mjgupta.drivenestapi.document.ProfileDocument;

import java.util.Optional;

public interface ProfileRepository extends MongoRepository<ProfileDocument, String> {

    Optional<ProfileDocument> findByEmail(String email);

    ProfileDocument findByClerkId(String clerkId);

    Boolean existsByClerkId(String clerkId);
}
