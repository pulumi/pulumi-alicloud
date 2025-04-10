// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationLivenessV2HttpGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationLivenessV2HttpGetArgs Empty = new ApplicationLivenessV2HttpGetArgs();

    @Import(name="isContainKeyWord")
    private @Nullable Output<Boolean> isContainKeyWord;

    public Optional<Output<Boolean>> isContainKeyWord() {
        return Optional.ofNullable(this.isContainKeyWord);
    }

    @Import(name="keyWord")
    private @Nullable Output<String> keyWord;

    public Optional<Output<String>> keyWord() {
        return Optional.ofNullable(this.keyWord);
    }

    @Import(name="path")
    private @Nullable Output<String> path;

    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    @Import(name="port")
    private @Nullable Output<Integer> port;

    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    @Import(name="scheme")
    private @Nullable Output<String> scheme;

    public Optional<Output<String>> scheme() {
        return Optional.ofNullable(this.scheme);
    }

    private ApplicationLivenessV2HttpGetArgs() {}

    private ApplicationLivenessV2HttpGetArgs(ApplicationLivenessV2HttpGetArgs $) {
        this.isContainKeyWord = $.isContainKeyWord;
        this.keyWord = $.keyWord;
        this.path = $.path;
        this.port = $.port;
        this.scheme = $.scheme;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationLivenessV2HttpGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationLivenessV2HttpGetArgs $;

        public Builder() {
            $ = new ApplicationLivenessV2HttpGetArgs();
        }

        public Builder(ApplicationLivenessV2HttpGetArgs defaults) {
            $ = new ApplicationLivenessV2HttpGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder isContainKeyWord(@Nullable Output<Boolean> isContainKeyWord) {
            $.isContainKeyWord = isContainKeyWord;
            return this;
        }

        public Builder isContainKeyWord(Boolean isContainKeyWord) {
            return isContainKeyWord(Output.of(isContainKeyWord));
        }

        public Builder keyWord(@Nullable Output<String> keyWord) {
            $.keyWord = keyWord;
            return this;
        }

        public Builder keyWord(String keyWord) {
            return keyWord(Output.of(keyWord));
        }

        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder scheme(@Nullable Output<String> scheme) {
            $.scheme = scheme;
            return this;
        }

        public Builder scheme(String scheme) {
            return scheme(Output.of(scheme));
        }

        public ApplicationLivenessV2HttpGetArgs build() {
            return $;
        }
    }

}
