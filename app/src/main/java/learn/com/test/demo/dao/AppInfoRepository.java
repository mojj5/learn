package learn.com.test.demo.dao;

import learn.com.test.demo.entity.AppInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppInfoRepository extends JpaRepository<AppInfo,Long> {

}
