package dk.cs.domaindb.repository;


import dk.cs.domaindb.models.domain.Domain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DomainRepository extends JpaRepository<Domain, Long> {

//    @Query("SELECT d FROM Domain d WHERE " +
//            "(:filterField = 'domainName' AND d.domainName = :filterValue) OR " +
//            "(:filterField = 'category' AND d.category = :filterValue) OR " +
//            "(:filterField = 'country' AND d.country = :filterValue)")
//    List<Domain> findDomainByField(@Param("filterField") String filterField, @Param("filterValue") Object filterValue);

    Domain findDomainByName(String name);
}