// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci.outputs;

import com.pulumi.alicloud.eci.outputs.GetImageCachesCach;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImageCachesResult {
    /**
     * @return A list of caches. Each element contains the following attributes:
     * 
     */
    private List<GetImageCachesCach> caches;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list ids of ECI Image Cache.
     * 
     */
    private List<String> ids;
    private @Nullable String image;
    /**
     * @return The name of the ECI Image Cache.
     * 
     */
    private @Nullable String imageCacheName;
    private @Nullable String nameRegex;
    /**
     * @return A list of ECI Image Cache names.
     * 
     */
    private List<String> names;
    private @Nullable String outputFile;
    /**
     * @return The id of snapshot.
     * 
     */
    private @Nullable String snapshotId;
    /**
     * @return The status of ECI Image Cache.
     * 
     */
    private @Nullable String status;

    private GetImageCachesResult() {}
    /**
     * @return A list of caches. Each element contains the following attributes:
     * 
     */
    public List<GetImageCachesCach> caches() {
        return this.caches;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list ids of ECI Image Cache.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> image() {
        return Optional.ofNullable(this.image);
    }
    /**
     * @return The name of the ECI Image Cache.
     * 
     */
    public Optional<String> imageCacheName() {
        return Optional.ofNullable(this.imageCacheName);
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of ECI Image Cache names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return The id of snapshot.
     * 
     */
    public Optional<String> snapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }
    /**
     * @return The status of ECI Image Cache.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageCachesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetImageCachesCach> caches;
        private String id;
        private List<String> ids;
        private @Nullable String image;
        private @Nullable String imageCacheName;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable String snapshotId;
        private @Nullable String status;
        public Builder() {}
        public Builder(GetImageCachesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caches = defaults.caches;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.image = defaults.image;
    	      this.imageCacheName = defaults.imageCacheName;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.snapshotId = defaults.snapshotId;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder caches(List<GetImageCachesCach> caches) {
            if (caches == null) {
              throw new MissingRequiredPropertyException("GetImageCachesResult", "caches");
            }
            this.caches = caches;
            return this;
        }
        public Builder caches(GetImageCachesCach... caches) {
            return caches(List.of(caches));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetImageCachesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetImageCachesResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder image(@Nullable String image) {

            this.image = image;
            return this;
        }
        @CustomType.Setter
        public Builder imageCacheName(@Nullable String imageCacheName) {

            this.imageCacheName = imageCacheName;
            return this;
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {

            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            if (names == null) {
              throw new MissingRequiredPropertyException("GetImageCachesResult", "names");
            }
            this.names = names;
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder snapshotId(@Nullable String snapshotId) {

            this.snapshotId = snapshotId;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        public GetImageCachesResult build() {
            final var _resultValue = new GetImageCachesResult();
            _resultValue.caches = caches;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.image = image;
            _resultValue.imageCacheName = imageCacheName;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.snapshotId = snapshotId;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}