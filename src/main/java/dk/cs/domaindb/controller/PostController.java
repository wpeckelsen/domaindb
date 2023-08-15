package dk.cs.domaindb.controller;


import dk.cs.domaindb.models.domain.Domain;
import dk.cs.domaindb.models.domain.DomainDto;
import dk.cs.domaindb.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("post")
public class PostController {
    DomainService domainService;

    @Autowired
    public PostController(DomainService domainService) {
        this.domainService = domainService;
    }



    @PostMapping("domain")
    public ResponseEntity<Domain> newDomain(@RequestBody Domain domain){
        DomainDto dto = domainService.newDomain(domain);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{domainID}")
                .buildAndExpand(dto).toUri();

        return ResponseEntity.created(location).build();
    }

    @PostMapping("domains")
    public ResponseEntity<List<Domain>> newDomains(@RequestBody List<Domain> domains){
        List<DomainDto> domain = domainService.newDomains(domains);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .buildAndExpand(domain)
                .toUri();

//                .path("/{domainID}")
//                .buildAndExpand(domain).toUri();
        return ResponseEntity.created(location).build();
    }




}
