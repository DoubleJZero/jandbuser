package jandbuser.api.repository;

import jandbuser.data.entity.TbUserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 사용자 repository
 *
 * <pre>
 * 코드 히스토리 (필요시 변경사항 기록)
 * </pre>
 *
 * @author JandB
 * @since 1.0
 */
public interface UserRepository extends JpaRepository<TbUserInfo, Long> {
}
