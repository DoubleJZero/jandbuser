package jandbuser.api.service;

import jandbuser.api.dto.UserInfoDto;
import jandbuser.api.repository.UserRepository;
import jandbuser.data.entity.TbUserInfo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 사용자 service
 *
 * <pre>
 * 코드 히스토리 (필요시 변경사항 기록)
 * </pre>
 *
 * @author JandB
 * @since 1.0
 */
@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserService {

    private final UserRepository userRepository;

    /**
     * test
     * @return String
     */
    public String getTestUser(){
        log.debug("##############################################");
        log.debug("test :: getTestBoard() :: {}","hello");
        log.debug("##############################################");

        return "hello User!";
    }

    /**
     * 사용자 목록 조회
     * @return 사용자목록
     */
    public List<UserInfoDto> getUserList(){
        return userRepository.findAll().stream().map(UserInfoDto::of).collect(Collectors.toList());
    }

    /**
     * 사용자정보 저장
     * @param userInfoDto 사용자정보DTO
     */
    public void saveUser(UserInfoDto userInfoDto){
        TbUserInfo entity =  userInfoDto.toEntity();
        entity.setRgstId("system");
        entity.setUpdtId("system");
        userRepository.saveAndFlush(entity);
    }
}
