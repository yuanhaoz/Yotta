package Yotta.spider.repository;

import Yotta.spider.domain.AssembleImage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by yuanhao on 2017/5/3.
 */
public interface AssembleImageRepository extends JpaRepository<AssembleImage, Long> {

    List<AssembleImage> findByTopicId(Long topicId);

}
