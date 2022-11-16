// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cddc.outputs;

import com.pulumi.alicloud.cddc.outputs.GetHostEcsLevelInfosInfo;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetHostEcsLevelInfosResult {
    private final String dbType;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String imageCategory;
    private final List<GetHostEcsLevelInfosInfo> infos;
    private final @Nullable String outputFile;
    private final String storageType;
    private final String zoneId;

    @CustomType.Constructor
    private GetHostEcsLevelInfosResult(
        @CustomType.Parameter("dbType") String dbType,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("imageCategory") @Nullable String imageCategory,
        @CustomType.Parameter("infos") List<GetHostEcsLevelInfosInfo> infos,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("storageType") String storageType,
        @CustomType.Parameter("zoneId") String zoneId) {
        this.dbType = dbType;
        this.id = id;
        this.imageCategory = imageCategory;
        this.infos = infos;
        this.outputFile = outputFile;
        this.storageType = storageType;
        this.zoneId = zoneId;
    }

    public String dbType() {
        return this.dbType;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> imageCategory() {
        return Optional.ofNullable(this.imageCategory);
    }
    public List<GetHostEcsLevelInfosInfo> infos() {
        return this.infos;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public String storageType() {
        return this.storageType;
    }
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHostEcsLevelInfosResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dbType;
        private String id;
        private @Nullable String imageCategory;
        private List<GetHostEcsLevelInfosInfo> infos;
        private @Nullable String outputFile;
        private String storageType;
        private String zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHostEcsLevelInfosResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbType = defaults.dbType;
    	      this.id = defaults.id;
    	      this.imageCategory = defaults.imageCategory;
    	      this.infos = defaults.infos;
    	      this.outputFile = defaults.outputFile;
    	      this.storageType = defaults.storageType;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder dbType(String dbType) {
            this.dbType = Objects.requireNonNull(dbType);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder imageCategory(@Nullable String imageCategory) {
            this.imageCategory = imageCategory;
            return this;
        }
        public Builder infos(List<GetHostEcsLevelInfosInfo> infos) {
            this.infos = Objects.requireNonNull(infos);
            return this;
        }
        public Builder infos(GetHostEcsLevelInfosInfo... infos) {
            return infos(List.of(infos));
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder storageType(String storageType) {
            this.storageType = Objects.requireNonNull(storageType);
            return this;
        }
        public Builder zoneId(String zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }        public GetHostEcsLevelInfosResult build() {
            return new GetHostEcsLevelInfosResult(dbType, id, imageCategory, infos, outputFile, storageType, zoneId);
        }
    }
}