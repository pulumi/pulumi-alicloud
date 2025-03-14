// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.log.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StoreIndexFullTextArgs extends com.pulumi.resources.ResourceArgs {

    public static final StoreIndexFullTextArgs Empty = new StoreIndexFullTextArgs();

    /**
     * Whether the case sensitive. Default to false.
     * 
     */
    @Import(name="caseSensitive")
    private @Nullable Output<Boolean> caseSensitive;

    /**
     * @return Whether the case sensitive. Default to false.
     * 
     */
    public Optional<Output<Boolean>> caseSensitive() {
        return Optional.ofNullable(this.caseSensitive);
    }

    /**
     * Whether includes the chinese. Default to false.
     * 
     */
    @Import(name="includeChinese")
    private @Nullable Output<Boolean> includeChinese;

    /**
     * @return Whether includes the chinese. Default to false.
     * 
     */
    public Optional<Output<Boolean>> includeChinese() {
        return Optional.ofNullable(this.includeChinese);
    }

    /**
     * The string of several split words, like &#34;\r&#34;, &#34;#&#34;
     * 
     */
    @Import(name="token")
    private @Nullable Output<String> token;

    /**
     * @return The string of several split words, like &#34;\r&#34;, &#34;#&#34;
     * 
     */
    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    private StoreIndexFullTextArgs() {}

    private StoreIndexFullTextArgs(StoreIndexFullTextArgs $) {
        this.caseSensitive = $.caseSensitive;
        this.includeChinese = $.includeChinese;
        this.token = $.token;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StoreIndexFullTextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StoreIndexFullTextArgs $;

        public Builder() {
            $ = new StoreIndexFullTextArgs();
        }

        public Builder(StoreIndexFullTextArgs defaults) {
            $ = new StoreIndexFullTextArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param caseSensitive Whether the case sensitive. Default to false.
         * 
         * @return builder
         * 
         */
        public Builder caseSensitive(@Nullable Output<Boolean> caseSensitive) {
            $.caseSensitive = caseSensitive;
            return this;
        }

        /**
         * @param caseSensitive Whether the case sensitive. Default to false.
         * 
         * @return builder
         * 
         */
        public Builder caseSensitive(Boolean caseSensitive) {
            return caseSensitive(Output.of(caseSensitive));
        }

        /**
         * @param includeChinese Whether includes the chinese. Default to false.
         * 
         * @return builder
         * 
         */
        public Builder includeChinese(@Nullable Output<Boolean> includeChinese) {
            $.includeChinese = includeChinese;
            return this;
        }

        /**
         * @param includeChinese Whether includes the chinese. Default to false.
         * 
         * @return builder
         * 
         */
        public Builder includeChinese(Boolean includeChinese) {
            return includeChinese(Output.of(includeChinese));
        }

        /**
         * @param token The string of several split words, like &#34;\r&#34;, &#34;#&#34;
         * 
         * @return builder
         * 
         */
        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token The string of several split words, like &#34;\r&#34;, &#34;#&#34;
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        public StoreIndexFullTextArgs build() {
            return $;
        }
    }

}
