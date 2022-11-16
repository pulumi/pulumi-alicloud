// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ehpc.outputs;

import com.pulumi.alicloud.ehpc.outputs.ClusterAdditionalVolumeRole;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterAdditionalVolume {
    /**
     * @return The queue of the nodes to which the additional file system is attached.
     * 
     */
    private final @Nullable String jobQueue;
    /**
     * @return The local directory on which the additional file system is mounted.
     * 
     */
    private final @Nullable String localDirectory;
    /**
     * @return The type of the cluster. Valid value: `PublicCloud`.
     * 
     */
    private final @Nullable String location;
    /**
     * @return The remote directory to which the additional file system is mounted.
     * 
     */
    private final @Nullable String remoteDirectory;
    /**
     * @return The roles. See the following `Block roles`.
     * 
     */
    private final @Nullable List<ClusterAdditionalVolumeRole> roles;
    /**
     * @return The ID of the additional file system.
     * 
     */
    private final @Nullable String volumeId;
    /**
     * @return The mount options of the file system.
     * 
     */
    private final @Nullable String volumeMountOption;
    /**
     * @return The mount target of the additional file system.
     * 
     */
    private final @Nullable String volumeMountpoint;
    /**
     * @return The type of the protocol that is used by the additional file system. Valid values: `NFS`, `SMB`. Default value: `NFS`
     * 
     */
    private final @Nullable String volumeProtocol;
    /**
     * @return The type of the additional shared storage. Only NAS file systems are supported.
     * 
     */
    private final @Nullable String volumeType;

    @CustomType.Constructor
    private ClusterAdditionalVolume(
        @CustomType.Parameter("jobQueue") @Nullable String jobQueue,
        @CustomType.Parameter("localDirectory") @Nullable String localDirectory,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("remoteDirectory") @Nullable String remoteDirectory,
        @CustomType.Parameter("roles") @Nullable List<ClusterAdditionalVolumeRole> roles,
        @CustomType.Parameter("volumeId") @Nullable String volumeId,
        @CustomType.Parameter("volumeMountOption") @Nullable String volumeMountOption,
        @CustomType.Parameter("volumeMountpoint") @Nullable String volumeMountpoint,
        @CustomType.Parameter("volumeProtocol") @Nullable String volumeProtocol,
        @CustomType.Parameter("volumeType") @Nullable String volumeType) {
        this.jobQueue = jobQueue;
        this.localDirectory = localDirectory;
        this.location = location;
        this.remoteDirectory = remoteDirectory;
        this.roles = roles;
        this.volumeId = volumeId;
        this.volumeMountOption = volumeMountOption;
        this.volumeMountpoint = volumeMountpoint;
        this.volumeProtocol = volumeProtocol;
        this.volumeType = volumeType;
    }

    /**
     * @return The queue of the nodes to which the additional file system is attached.
     * 
     */
    public Optional<String> jobQueue() {
        return Optional.ofNullable(this.jobQueue);
    }
    /**
     * @return The local directory on which the additional file system is mounted.
     * 
     */
    public Optional<String> localDirectory() {
        return Optional.ofNullable(this.localDirectory);
    }
    /**
     * @return The type of the cluster. Valid value: `PublicCloud`.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return The remote directory to which the additional file system is mounted.
     * 
     */
    public Optional<String> remoteDirectory() {
        return Optional.ofNullable(this.remoteDirectory);
    }
    /**
     * @return The roles. See the following `Block roles`.
     * 
     */
    public List<ClusterAdditionalVolumeRole> roles() {
        return this.roles == null ? List.of() : this.roles;
    }
    /**
     * @return The ID of the additional file system.
     * 
     */
    public Optional<String> volumeId() {
        return Optional.ofNullable(this.volumeId);
    }
    /**
     * @return The mount options of the file system.
     * 
     */
    public Optional<String> volumeMountOption() {
        return Optional.ofNullable(this.volumeMountOption);
    }
    /**
     * @return The mount target of the additional file system.
     * 
     */
    public Optional<String> volumeMountpoint() {
        return Optional.ofNullable(this.volumeMountpoint);
    }
    /**
     * @return The type of the protocol that is used by the additional file system. Valid values: `NFS`, `SMB`. Default value: `NFS`
     * 
     */
    public Optional<String> volumeProtocol() {
        return Optional.ofNullable(this.volumeProtocol);
    }
    /**
     * @return The type of the additional shared storage. Only NAS file systems are supported.
     * 
     */
    public Optional<String> volumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAdditionalVolume defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String jobQueue;
        private @Nullable String localDirectory;
        private @Nullable String location;
        private @Nullable String remoteDirectory;
        private @Nullable List<ClusterAdditionalVolumeRole> roles;
        private @Nullable String volumeId;
        private @Nullable String volumeMountOption;
        private @Nullable String volumeMountpoint;
        private @Nullable String volumeProtocol;
        private @Nullable String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterAdditionalVolume defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobQueue = defaults.jobQueue;
    	      this.localDirectory = defaults.localDirectory;
    	      this.location = defaults.location;
    	      this.remoteDirectory = defaults.remoteDirectory;
    	      this.roles = defaults.roles;
    	      this.volumeId = defaults.volumeId;
    	      this.volumeMountOption = defaults.volumeMountOption;
    	      this.volumeMountpoint = defaults.volumeMountpoint;
    	      this.volumeProtocol = defaults.volumeProtocol;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder jobQueue(@Nullable String jobQueue) {
            this.jobQueue = jobQueue;
            return this;
        }
        public Builder localDirectory(@Nullable String localDirectory) {
            this.localDirectory = localDirectory;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder remoteDirectory(@Nullable String remoteDirectory) {
            this.remoteDirectory = remoteDirectory;
            return this;
        }
        public Builder roles(@Nullable List<ClusterAdditionalVolumeRole> roles) {
            this.roles = roles;
            return this;
        }
        public Builder roles(ClusterAdditionalVolumeRole... roles) {
            return roles(List.of(roles));
        }
        public Builder volumeId(@Nullable String volumeId) {
            this.volumeId = volumeId;
            return this;
        }
        public Builder volumeMountOption(@Nullable String volumeMountOption) {
            this.volumeMountOption = volumeMountOption;
            return this;
        }
        public Builder volumeMountpoint(@Nullable String volumeMountpoint) {
            this.volumeMountpoint = volumeMountpoint;
            return this;
        }
        public Builder volumeProtocol(@Nullable String volumeProtocol) {
            this.volumeProtocol = volumeProtocol;
            return this;
        }
        public Builder volumeType(@Nullable String volumeType) {
            this.volumeType = volumeType;
            return this;
        }        public ClusterAdditionalVolume build() {
            return new ClusterAdditionalVolume(jobQueue, localDirectory, location, remoteDirectory, roles, volumeId, volumeMountOption, volumeMountpoint, volumeProtocol, volumeType);
        }
    }
}