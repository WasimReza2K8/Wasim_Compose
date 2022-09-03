/*
 * Copyright 2021 Wasim Reza.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.feature.testrun.presentation.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.core.ext.viewBinding
import com.example.feature.testrun.databinding.TestRunActivityBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TestRunActivity : AppCompatActivity() {
    private val binding: TestRunActivityBinding by viewBinding(TestRunActivityBinding::inflate)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}
