package org.example.demo_travel.travel;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TravelServiceImpl implements TravelService {
    @Autowired
    TravelMapper travelMapper;




    @Override
    public int insertOK(TravelVO vo) {
        return 0;
    }

    @Override
    public int updateOK(TravelVO vo) {
        return 0;
    }

    @Override
    public int deleteOK(TravelVO vo) {
        return 0;
    }

    @Override
    public TravelVO selectOne(TravelVO vo) {
        return null;
    }

    @Override
    public List<TravelVO> selectAll(int cpage, int limit) {
        return List.of();
    }

    @Override
    public List<TravelVO> searchList(int cpage, int limit, String searchKey, String searchWord) {
        return List.of();
    }
}//end class
