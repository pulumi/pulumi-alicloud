// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cr.outputs;

import com.pulumi.alicloud.cr.outputs.GetNamespacesNamespace;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNamespacesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A list of matched Container Registry namespaces. Its element is a namespace name.
     * 
     */
    private final List<String> ids;
    private final @Nullable String nameRegex;
    /**
     * @return A list of namespace names.
     * 
     */
    private final List<String> names;
    /**
     * @return A list of matched Container Registry namespaces. Each element contains the following attributes:
     * 
     */
    private final List<GetNamespacesNamespace> namespaces;
    private final @Nullable String outputFile;

    @CustomType.Constructor
    private GetNamespacesResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("namespaces") List<GetNamespacesNamespace> namespaces,
        @CustomType.Parameter("outputFile") @Nullable String outputFile) {
        this.id = id;
        this.ids = ids;
        this.nameRegex = nameRegex;
        this.names = names;
        this.namespaces = namespaces;
        this.outputFile = outputFile;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of matched Container Registry namespaces. Its element is a namespace name.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of namespace names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    /**
     * @return A list of matched Container Registry namespaces. Each element contains the following attributes:
     * 
     */
    public List<GetNamespacesNamespace> namespaces() {
        return this.namespaces;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamespacesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private List<GetNamespacesNamespace> namespaces;
        private @Nullable String outputFile;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNamespacesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.namespaces = defaults.namespaces;
    	      this.outputFile = defaults.outputFile;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        public Builder namespaces(List<GetNamespacesNamespace> namespaces) {
            this.namespaces = Objects.requireNonNull(namespaces);
            return this;
        }
        public Builder namespaces(GetNamespacesNamespace... namespaces) {
            return namespaces(List.of(namespaces));
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }        public GetNamespacesResult build() {
            return new GetNamespacesResult(id, ids, nameRegex, names, namespaces, outputFile);
        }
    }
}