// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFoldersFolder {
    /**
     * @return The ID of the folder.
     * 
     */
    private String folderId;
    /**
     * @return The name of the folder.
     * 
     */
    private String folderName;
    /**
     * @return The ID of the folder.
     * 
     */
    private String id;
    /**
     * @return The ID of the parent folder.
     * 
     */
    private String parentFolderId;

    private GetFoldersFolder() {}
    /**
     * @return The ID of the folder.
     * 
     */
    public String folderId() {
        return this.folderId;
    }
    /**
     * @return The name of the folder.
     * 
     */
    public String folderName() {
        return this.folderName;
    }
    /**
     * @return The ID of the folder.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the parent folder.
     * 
     */
    public String parentFolderId() {
        return this.parentFolderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFoldersFolder defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String folderId;
        private String folderName;
        private String id;
        private String parentFolderId;
        public Builder() {}
        public Builder(GetFoldersFolder defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.folderId = defaults.folderId;
    	      this.folderName = defaults.folderName;
    	      this.id = defaults.id;
    	      this.parentFolderId = defaults.parentFolderId;
        }

        @CustomType.Setter
        public Builder folderId(String folderId) {
            if (folderId == null) {
              throw new MissingRequiredPropertyException("GetFoldersFolder", "folderId");
            }
            this.folderId = folderId;
            return this;
        }
        @CustomType.Setter
        public Builder folderName(String folderName) {
            if (folderName == null) {
              throw new MissingRequiredPropertyException("GetFoldersFolder", "folderName");
            }
            this.folderName = folderName;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetFoldersFolder", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder parentFolderId(String parentFolderId) {
            if (parentFolderId == null) {
              throw new MissingRequiredPropertyException("GetFoldersFolder", "parentFolderId");
            }
            this.parentFolderId = parentFolderId;
            return this;
        }
        public GetFoldersFolder build() {
            final var _resultValue = new GetFoldersFolder();
            _resultValue.folderId = folderId;
            _resultValue.folderName = folderName;
            _resultValue.id = id;
            _resultValue.parentFolderId = parentFolderId;
            return _resultValue;
        }
    }
}