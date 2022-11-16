// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFilesetsFileset {
    /**
     * @return The time when Fileset was created.
     * 
     */
    private final String createTime;
    /**
     * @return Description of Fileset.
     * 
     */
    private final String description;
    /**
     * @return The ID of the file system.
     * 
     */
    private final String fileSystemId;
    /**
     * @return The path of Fileset.
     * 
     */
    private final String fileSystemPath;
    /**
     * @return The first ID of the resource.
     * 
     */
    private final String filesetId;
    /**
     * @return The ID of the Fileset.
     * 
     */
    private final String id;
    /**
     * @return The status of the fileset.
     * 
     */
    private final String status;
    /**
     * @return The latest update time of Fileset.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetFilesetsFileset(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("fileSystemId") String fileSystemId,
        @CustomType.Parameter("fileSystemPath") String fileSystemPath,
        @CustomType.Parameter("filesetId") String filesetId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.fileSystemId = fileSystemId;
        this.fileSystemPath = fileSystemPath;
        this.filesetId = filesetId;
        this.id = id;
        this.status = status;
        this.updateTime = updateTime;
    }

    /**
     * @return The time when Fileset was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Description of Fileset.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the file system.
     * 
     */
    public String fileSystemId() {
        return this.fileSystemId;
    }
    /**
     * @return The path of Fileset.
     * 
     */
    public String fileSystemPath() {
        return this.fileSystemPath;
    }
    /**
     * @return The first ID of the resource.
     * 
     */
    public String filesetId() {
        return this.filesetId;
    }
    /**
     * @return The ID of the Fileset.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The status of the fileset.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The latest update time of Fileset.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFilesetsFileset defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String fileSystemId;
        private String fileSystemPath;
        private String filesetId;
        private String id;
        private String status;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFilesetsFileset defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.fileSystemPath = defaults.fileSystemPath;
    	      this.filesetId = defaults.filesetId;
    	      this.id = defaults.id;
    	      this.status = defaults.status;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = Objects.requireNonNull(fileSystemId);
            return this;
        }
        public Builder fileSystemPath(String fileSystemPath) {
            this.fileSystemPath = Objects.requireNonNull(fileSystemPath);
            return this;
        }
        public Builder filesetId(String filesetId) {
            this.filesetId = Objects.requireNonNull(filesetId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetFilesetsFileset build() {
            return new GetFilesetsFileset(createTime, description, fileSystemId, fileSystemPath, filesetId, id, status, updateTime);
        }
    }
}