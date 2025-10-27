package in.mjgupta.drivenestapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.mjgupta.drivenestapi.document.FileMetadataDocument;

import java.util.List;

public interface FileMetadataRepository extends MongoRepository<FileMetadataDocument, String> {

    List<FileMetadataDocument> findByClerkId(String clerkId);

    Long countByClerkId(String clerkId);
}
