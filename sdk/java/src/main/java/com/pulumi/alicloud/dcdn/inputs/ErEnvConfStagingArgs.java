// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dcdn.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ErEnvConfStagingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ErEnvConfStagingArgs Empty = new ErEnvConfStagingArgs();

    @Import(name="allowedHosts")
    private @Nullable Output<List<String>> allowedHosts;

    public Optional<Output<List<String>>> allowedHosts() {
        return Optional.ofNullable(this.allowedHosts);
    }

    @Import(name="codeRev")
    private @Nullable Output<String> codeRev;

    public Optional<Output<String>> codeRev() {
        return Optional.ofNullable(this.codeRev);
    }

    @Import(name="specName")
    private @Nullable Output<String> specName;

    public Optional<Output<String>> specName() {
        return Optional.ofNullable(this.specName);
    }

    private ErEnvConfStagingArgs() {}

    private ErEnvConfStagingArgs(ErEnvConfStagingArgs $) {
        this.allowedHosts = $.allowedHosts;
        this.codeRev = $.codeRev;
        this.specName = $.specName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ErEnvConfStagingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ErEnvConfStagingArgs $;

        public Builder() {
            $ = new ErEnvConfStagingArgs();
        }

        public Builder(ErEnvConfStagingArgs defaults) {
            $ = new ErEnvConfStagingArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowedHosts(@Nullable Output<List<String>> allowedHosts) {
            $.allowedHosts = allowedHosts;
            return this;
        }

        public Builder allowedHosts(List<String> allowedHosts) {
            return allowedHosts(Output.of(allowedHosts));
        }

        public Builder allowedHosts(String... allowedHosts) {
            return allowedHosts(List.of(allowedHosts));
        }

        public Builder codeRev(@Nullable Output<String> codeRev) {
            $.codeRev = codeRev;
            return this;
        }

        public Builder codeRev(String codeRev) {
            return codeRev(Output.of(codeRev));
        }

        public Builder specName(@Nullable Output<String> specName) {
            $.specName = specName;
            return this;
        }

        public Builder specName(String specName) {
            return specName(Output.of(specName));
        }

        public ErEnvConfStagingArgs build() {
            return $;
        }
    }

}