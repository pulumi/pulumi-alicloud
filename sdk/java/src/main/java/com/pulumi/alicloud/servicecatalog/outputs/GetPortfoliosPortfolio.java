// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.servicecatalog.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPortfoliosPortfolio {
    /**
     * @return The creation time of the portfolio
     * 
     */
    private String createTime;
    /**
     * @return The description of the portfolio
     * 
     */
    private String description;
    /**
     * @return The ID of the portfolio
     * 
     */
    private String id;
    /**
     * @return The ARN of the portfolio
     * 
     */
    private String portfolioArn;
    /**
     * @return The ID of the portfolio
     * 
     */
    private String portfolioId;
    /**
     * @return The name of the portfolio
     * 
     */
    private String portfolioName;
    /**
     * @return The provider name of the portfolio
     * 
     */
    private String providerName;

    private GetPortfoliosPortfolio() {}
    /**
     * @return The creation time of the portfolio
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The description of the portfolio
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the portfolio
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ARN of the portfolio
     * 
     */
    public String portfolioArn() {
        return this.portfolioArn;
    }
    /**
     * @return The ID of the portfolio
     * 
     */
    public String portfolioId() {
        return this.portfolioId;
    }
    /**
     * @return The name of the portfolio
     * 
     */
    public String portfolioName() {
        return this.portfolioName;
    }
    /**
     * @return The provider name of the portfolio
     * 
     */
    public String providerName() {
        return this.providerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPortfoliosPortfolio defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createTime;
        private String description;
        private String id;
        private String portfolioArn;
        private String portfolioId;
        private String portfolioName;
        private String providerName;
        public Builder() {}
        public Builder(GetPortfoliosPortfolio defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.portfolioArn = defaults.portfolioArn;
    	      this.portfolioId = defaults.portfolioId;
    	      this.portfolioName = defaults.portfolioName;
    	      this.providerName = defaults.providerName;
        }

        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetPortfoliosPortfolio", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetPortfoliosPortfolio", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPortfoliosPortfolio", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder portfolioArn(String portfolioArn) {
            if (portfolioArn == null) {
              throw new MissingRequiredPropertyException("GetPortfoliosPortfolio", "portfolioArn");
            }
            this.portfolioArn = portfolioArn;
            return this;
        }
        @CustomType.Setter
        public Builder portfolioId(String portfolioId) {
            if (portfolioId == null) {
              throw new MissingRequiredPropertyException("GetPortfoliosPortfolio", "portfolioId");
            }
            this.portfolioId = portfolioId;
            return this;
        }
        @CustomType.Setter
        public Builder portfolioName(String portfolioName) {
            if (portfolioName == null) {
              throw new MissingRequiredPropertyException("GetPortfoliosPortfolio", "portfolioName");
            }
            this.portfolioName = portfolioName;
            return this;
        }
        @CustomType.Setter
        public Builder providerName(String providerName) {
            if (providerName == null) {
              throw new MissingRequiredPropertyException("GetPortfoliosPortfolio", "providerName");
            }
            this.providerName = providerName;
            return this;
        }
        public GetPortfoliosPortfolio build() {
            final var _resultValue = new GetPortfoliosPortfolio();
            _resultValue.createTime = createTime;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.portfolioArn = portfolioArn;
            _resultValue.portfolioId = portfolioId;
            _resultValue.portfolioName = portfolioName;
            _resultValue.providerName = providerName;
            return _resultValue;
        }
    }
}
