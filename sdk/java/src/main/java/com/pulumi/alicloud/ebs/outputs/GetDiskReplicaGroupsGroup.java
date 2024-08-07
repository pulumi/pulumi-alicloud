// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ebs.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDiskReplicaGroupsGroup {
    /**
     * @return The description of the consistent replication group.
     * 
     */
    private String description;
    /**
     * @return The ID of the region to which the disaster recovery site belongs.
     * 
     */
    private String destinationRegionId;
    /**
     * @return The ID of the zone to which the disaster recovery site belongs.
     * 
     */
    private String destinationZoneId;
    /**
     * @return Consistent replication group name.
     * 
     */
    private String groupName;
    /**
     * @return The ID of the Disk Replica Group.
     * 
     */
    private String id;
    private String lastRecoverPoint;
    /**
     * @return The initial source region of the replication group.
     * 
     */
    private String primaryRegion;
    /**
     * @return The initial source available area of the replication group.
     * 
     */
    private String primaryZone;
    /**
     * @return The ID of the consistent replication group.
     * 
     */
    private String replicaGroupId;
    /**
     * @return The recovery point objective (RPO) of the replication pair-consistent group.
     * 
     */
    private Integer rpo;
    /**
     * @return Site information sources for replication pairs and consistent replication groups.
     * 
     */
    private String site;
    /**
     * @return The ID of the region to which the production site belongs.
     * 
     */
    private String sourceRegionId;
    /**
     * @return The ID of the zone to which the production site belongs.
     * 
     */
    private String sourceZoneId;
    /**
     * @return The initial destination region of the replication group.
     * 
     */
    private String standbyRegion;
    /**
     * @return The initial destination zone of the replication group.
     * 
     */
    private String standbyZone;
    /**
     * @return The status of the consistent replication group. Possible values:
     * 
     */
    private String status;

    private GetDiskReplicaGroupsGroup() {}
    /**
     * @return The description of the consistent replication group.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the region to which the disaster recovery site belongs.
     * 
     */
    public String destinationRegionId() {
        return this.destinationRegionId;
    }
    /**
     * @return The ID of the zone to which the disaster recovery site belongs.
     * 
     */
    public String destinationZoneId() {
        return this.destinationZoneId;
    }
    /**
     * @return Consistent replication group name.
     * 
     */
    public String groupName() {
        return this.groupName;
    }
    /**
     * @return The ID of the Disk Replica Group.
     * 
     */
    public String id() {
        return this.id;
    }
    public String lastRecoverPoint() {
        return this.lastRecoverPoint;
    }
    /**
     * @return The initial source region of the replication group.
     * 
     */
    public String primaryRegion() {
        return this.primaryRegion;
    }
    /**
     * @return The initial source available area of the replication group.
     * 
     */
    public String primaryZone() {
        return this.primaryZone;
    }
    /**
     * @return The ID of the consistent replication group.
     * 
     */
    public String replicaGroupId() {
        return this.replicaGroupId;
    }
    /**
     * @return The recovery point objective (RPO) of the replication pair-consistent group.
     * 
     */
    public Integer rpo() {
        return this.rpo;
    }
    /**
     * @return Site information sources for replication pairs and consistent replication groups.
     * 
     */
    public String site() {
        return this.site;
    }
    /**
     * @return The ID of the region to which the production site belongs.
     * 
     */
    public String sourceRegionId() {
        return this.sourceRegionId;
    }
    /**
     * @return The ID of the zone to which the production site belongs.
     * 
     */
    public String sourceZoneId() {
        return this.sourceZoneId;
    }
    /**
     * @return The initial destination region of the replication group.
     * 
     */
    public String standbyRegion() {
        return this.standbyRegion;
    }
    /**
     * @return The initial destination zone of the replication group.
     * 
     */
    public String standbyZone() {
        return this.standbyZone;
    }
    /**
     * @return The status of the consistent replication group. Possible values:
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDiskReplicaGroupsGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String destinationRegionId;
        private String destinationZoneId;
        private String groupName;
        private String id;
        private String lastRecoverPoint;
        private String primaryRegion;
        private String primaryZone;
        private String replicaGroupId;
        private Integer rpo;
        private String site;
        private String sourceRegionId;
        private String sourceZoneId;
        private String standbyRegion;
        private String standbyZone;
        private String status;
        public Builder() {}
        public Builder(GetDiskReplicaGroupsGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationRegionId = defaults.destinationRegionId;
    	      this.destinationZoneId = defaults.destinationZoneId;
    	      this.groupName = defaults.groupName;
    	      this.id = defaults.id;
    	      this.lastRecoverPoint = defaults.lastRecoverPoint;
    	      this.primaryRegion = defaults.primaryRegion;
    	      this.primaryZone = defaults.primaryZone;
    	      this.replicaGroupId = defaults.replicaGroupId;
    	      this.rpo = defaults.rpo;
    	      this.site = defaults.site;
    	      this.sourceRegionId = defaults.sourceRegionId;
    	      this.sourceZoneId = defaults.sourceZoneId;
    	      this.standbyRegion = defaults.standbyRegion;
    	      this.standbyZone = defaults.standbyZone;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetDiskReplicaGroupsGroup", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder destinationRegionId(String destinationRegionId) {
            if (destinationRegionId == null) {
              throw new MissingRequiredPropertyException("GetDiskReplicaGroupsGroup", "destinationRegionId");
            }
            this.destinationRegionId = destinationRegionId;
            return this;
        }
        @CustomType.Setter
        public Builder destinationZoneId(String destinationZoneId) {
            if (destinationZoneId == null) {
              throw new MissingRequiredPropertyException("GetDiskReplicaGroupsGroup", "destinationZoneId");
            }
            this.destinationZoneId = destinationZoneId;
            return this;
        }
        @CustomType.Setter
        public Builder groupName(String groupName) {
            if (groupName == null) {
              throw new MissingRequiredPropertyException("GetDiskReplicaGroupsGroup", "groupName");
            }
            this.groupName = groupName;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDiskReplicaGroupsGroup", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder lastRecoverPoint(String lastRecoverPoint) {
            if (lastRecoverPoint == null) {
              throw new MissingRequiredPropertyException("GetDiskReplicaGroupsGroup", "lastRecoverPoint");
            }
            this.lastRecoverPoint = lastRecoverPoint;
            return this;
        }
        @CustomType.Setter
        public Builder primaryRegion(String primaryRegion) {
            if (primaryRegion == null) {
              throw new MissingRequiredPropertyException("GetDiskReplicaGroupsGroup", "primaryRegion");
            }
            this.primaryRegion = primaryRegion;
            return this;
        }
        @CustomType.Setter
        public Builder primaryZone(String primaryZone) {
            if (primaryZone == null) {
              throw new MissingRequiredPropertyException("GetDiskReplicaGroupsGroup", "primaryZone");
            }
            this.primaryZone = primaryZone;
            return this;
        }
        @CustomType.Setter
        public Builder replicaGroupId(String replicaGroupId) {
            if (replicaGroupId == null) {
              throw new MissingRequiredPropertyException("GetDiskReplicaGroupsGroup", "replicaGroupId");
            }
            this.replicaGroupId = replicaGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder rpo(Integer rpo) {
            if (rpo == null) {
              throw new MissingRequiredPropertyException("GetDiskReplicaGroupsGroup", "rpo");
            }
            this.rpo = rpo;
            return this;
        }
        @CustomType.Setter
        public Builder site(String site) {
            if (site == null) {
              throw new MissingRequiredPropertyException("GetDiskReplicaGroupsGroup", "site");
            }
            this.site = site;
            return this;
        }
        @CustomType.Setter
        public Builder sourceRegionId(String sourceRegionId) {
            if (sourceRegionId == null) {
              throw new MissingRequiredPropertyException("GetDiskReplicaGroupsGroup", "sourceRegionId");
            }
            this.sourceRegionId = sourceRegionId;
            return this;
        }
        @CustomType.Setter
        public Builder sourceZoneId(String sourceZoneId) {
            if (sourceZoneId == null) {
              throw new MissingRequiredPropertyException("GetDiskReplicaGroupsGroup", "sourceZoneId");
            }
            this.sourceZoneId = sourceZoneId;
            return this;
        }
        @CustomType.Setter
        public Builder standbyRegion(String standbyRegion) {
            if (standbyRegion == null) {
              throw new MissingRequiredPropertyException("GetDiskReplicaGroupsGroup", "standbyRegion");
            }
            this.standbyRegion = standbyRegion;
            return this;
        }
        @CustomType.Setter
        public Builder standbyZone(String standbyZone) {
            if (standbyZone == null) {
              throw new MissingRequiredPropertyException("GetDiskReplicaGroupsGroup", "standbyZone");
            }
            this.standbyZone = standbyZone;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetDiskReplicaGroupsGroup", "status");
            }
            this.status = status;
            return this;
        }
        public GetDiskReplicaGroupsGroup build() {
            final var _resultValue = new GetDiskReplicaGroupsGroup();
            _resultValue.description = description;
            _resultValue.destinationRegionId = destinationRegionId;
            _resultValue.destinationZoneId = destinationZoneId;
            _resultValue.groupName = groupName;
            _resultValue.id = id;
            _resultValue.lastRecoverPoint = lastRecoverPoint;
            _resultValue.primaryRegion = primaryRegion;
            _resultValue.primaryZone = primaryZone;
            _resultValue.replicaGroupId = replicaGroupId;
            _resultValue.rpo = rpo;
            _resultValue.site = site;
            _resultValue.sourceRegionId = sourceRegionId;
            _resultValue.sourceZoneId = sourceZoneId;
            _resultValue.standbyRegion = standbyRegion;
            _resultValue.standbyZone = standbyZone;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
