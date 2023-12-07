package openstack.eco_stack.repository;

import openstack.eco_stack.model.InstanceMetric;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetricRepository extends MongoRepository<InstanceMetric, String> {
}
