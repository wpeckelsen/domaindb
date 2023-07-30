package dk.cs.domaindb.service;

import dk.cs.domaindb.models.domain.Domain;
import dk.cs.domaindb.models.domain.DomainDto;
import dk.cs.domaindb.repository.DomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DomainService {

    private final DomainRepository domainRepository;

    @Autowired
    public DomainService(DomainRepository domainRepository) {
        this.domainRepository = domainRepository;
    }

    public static Domain domainMaker(DomainDto dto) {
        Domain domain = new Domain();
        domain.setDomainID(dto.getDomainID());
        domain.setCountry(dto.getCountry());
        domain.setSource(dto.getSource());
        domain.setName(dto.getName());
        domain.setDomainRating(dto.getDomainRating());
        domain.setTraffic(dto.getTraffic());
        domain.setReferringDomains(dto.getReferringDomains());
        domain.setCategory(dto.getCategory());
        domain.setTag(dto.getTag());
        domain.setPrice(dto.getPrice());
        domain.setGamblingPrice(dto.getGamblingPrice());
        domain.setEmail(dto.getEmail());
        domain.setNotes(dto.getNotes());

        return domain;
    }

    public static DomainDto domainDtoMaker(Domain domain) {
        DomainDto dto = new DomainDto();
        dto.setCountry(domain.getCountry());
        dto.setSource(domain.getSource());
        dto.setName(domain.getName());
        dto.setDomainRating(domain.getDomainRating());
        dto.setTraffic(domain.getTraffic());
        dto.setReferringDomains(domain.getReferringDomains());
        dto.setCategory(domain.getCategory());
        dto.setTag(domain.getTag());
        dto.setPrice(domain.getPrice());
        dto.setGamblingPrice(domain.getGamblingPrice());
        dto.setEmail(domain.getEmail());
        dto.setNotes(domain.getNotes());
        return dto;
    }

    public List<Domain> sortDomains(Sort sort) {
        return domainRepository.findAll(sort);
    }


    public Domain findDomainByName(String name) {
        return domainRepository.findDomainByName(name);
    }

    public DomainDto newDomain(Domain domain) {
        DomainDto newDomain = domainDtoMaker(domain);
        return newDomain;
    }



//    user provides application with list of Domains, these are turned into DTOs and added into a new list
//    of DomainDtos and this list of domainDtos is then returned
//    useful for batch uploads
    public List<DomainDto> newDomains(List<Domain> domains) {
        List<DomainDto> domainDtoList = new ArrayList<>();

        for (Domain domain : domains) {
            DomainDto newDomain = domainDtoMaker(domain);
            domainDtoList.add(newDomain);
        }
        return domainDtoList;
    }


    public List<Domain> findDuplicates(List<Domain> newDomains) {
        List<Domain> duplicates = new ArrayList<>();

        for (Domain newDomain : newDomains) {
            Domain existingDomain = domainRepository.findDomainByName(newDomain.getName());
            if (existingDomain != null) {
                duplicates.add(newDomain);
            }
        }

        return duplicates;
    }

    public List<Domain> findUniques(List<Domain> newDomains) {
        List<Domain> uniqueDomains = new ArrayList<>();

        for (Domain newDomain : newDomains) {
            Domain existingDomain = domainRepository.findDomainByName(newDomain.getName());
            if (existingDomain == null) {
                uniqueDomains.add(newDomain);
            }
        }

        return uniqueDomains;
    }
}
