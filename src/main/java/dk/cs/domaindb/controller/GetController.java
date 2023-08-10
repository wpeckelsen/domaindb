package dk.cs.domaindb.controller;

import dk.cs.domaindb.models.domain.Domain;
import dk.cs.domaindb.models.domain.DomainDto;
import dk.cs.domaindb.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("get")
public class GetController {

    DomainService domainService;

    @Autowired
    public GetController(DomainService domainService) {
        this.domainService = domainService;
    }

    @GetMapping("search/{email}")
    public Domain findEmail(@PathVariable String email){
        return domainService.findEmail(email);
    }


    @GetMapping("search/{url}")
    public Domain findDomain(@PathVariable String url){
        return domainService.findDomain(url);
    }

    @GetMapping("search/batch")
    public List<DomainDto> findDomains(@RequestBody List<Domain> domains){
        return domainService.findDomains(domains);
    }


    // this method accepts a list of domains and returns which domains are duplicated in that list.
    @GetMapping("duplicate")
    public List<Domain> duplicate(@RequestBody List<Domain> domains){
        return domainService.findDuplicates(domains);
    }


    // this method accepts a list of domains and returns which domains are unique in that list.
    @GetMapping("unique")
    public List<Domain> unique(@RequestBody List<Domain> domains){
        return domainService.findUniques(domains);
    }


    //     this method returns all domains, with either ascending or descending sorting
    @GetMapping("sort/{field}/{order}")
    public List<Domain> sort(@PathVariable String field,
                             @PathVariable String order) {
        Sort.Direction direction = "desc".equalsIgnoreCase(order) ? Sort.Direction.DESC : Sort.Direction.ASC;
        Sort sort = Sort.by(direction, field);
        return domainService.sortDomains(sort);
    }


}
